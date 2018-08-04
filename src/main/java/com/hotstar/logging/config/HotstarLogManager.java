package com.hotstar.logging.config;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by devraj on 04/08/18.
 */

@Getter @Setter
public class HotstarLogManager {

    public enum LoggingLevel {
        INFO, WARN, ERROR, DEBUG
    }

    private HotstarLogManager.LoggingLevel level;
    private String sinkType;
    private Class kclass;

}
