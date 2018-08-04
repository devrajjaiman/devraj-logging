package com.hotstar.logging.sink.impl;

import com.hotstar.logging.config.LogArgs;
import com.hotstar.logging.sink.ISink;
import org.springframework.stereotype.Service;

/**
 * Created by devraj on 04/08/18.
 */
@Service
public class StdOut implements ISink {

    @Override
    public void save(LogArgs args) {
        System.out.println(args.getDate() + " " + args.getRequestIdentifier() +" " + args.getMessage() );
    }

    @Override
    public String getSinkType() {
        return "stdout";
    }
}
