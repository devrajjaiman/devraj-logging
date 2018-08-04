package com.hotstar.logging.sink;

import com.hotstar.logging.config.LogArgs;

/**
 * Created by devraj on 04/08/18.
 */
public interface ISink {
    void save(LogArgs args);
    String getSinkType();
}
