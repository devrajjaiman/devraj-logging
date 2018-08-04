package com.hotstar.logging.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.logging.LogLevel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by devraj on 04/08/18.
 */
@Configuration
@PropertySource("classpath:/logging.properties")
public class LogConfig {

    @Value("${logging.sink.type}")
    private String sinkType;

    @Value("${logging.level}")
    private HotstarLogManager.LoggingLevel logLevel;


    @Bean
    public HotstarLogManager logManager() {
        final HotstarLogManager logManager = new HotstarLogManager();
        //set all configuration into log manager
        logManager.setLevel(logLevel);
        logManager.setSinkType(sinkType);
        return logManager;
    }


}
