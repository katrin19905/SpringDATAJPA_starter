package com.work.config;

import com.web.config.WebConfiguration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Configuration;

@Import(WebConfiguration.class)
@Configuration(proxyBeanMethods = true)

public class ApplicationConfiguration {
}
