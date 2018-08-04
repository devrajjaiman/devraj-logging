package com.hotstar.logging.sink.impl;

import com.hotstar.logging.config.LogArgs;
import com.hotstar.logging.sink.ISink;
import org.springframework.stereotype.Service;

/**
 * Created by devraj on 04/08/18.
 */
@Service
public class S3Sink implements ISink {


    @Override
    public void save(LogArgs args) {
        // save this entry to s3
    }

    @Override
    public String getSinkType() {
        return "s3";
    }
}
