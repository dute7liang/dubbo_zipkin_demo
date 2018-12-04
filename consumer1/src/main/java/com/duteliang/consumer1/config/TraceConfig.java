package com.duteliang.consumer1.config;

import brave.spring.beans.TracingFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import zipkin2.Span;
import zipkin2.reporter.AsyncReporter;
import zipkin2.reporter.okhttp3.OkHttpSender;

@Configuration
public class TraceConfig {

    @Bean(name = "tracing")
    public TracingFactoryBean getTracingBean(){
        TracingFactoryBean tracingFactoryBean = new TracingFactoryBean();
        tracingFactoryBean.setLocalServiceName("consumer1");
        AsyncReporter<Span> spanAsyncReporter = AsyncReporter.create(OkHttpSender.create("http://localhost:9411/api/v2/spans"));
        tracingFactoryBean.setSpanReporter(spanAsyncReporter);
        return tracingFactoryBean;
    }

}
