package com.hotstar.logging;

import com.hotstar.logging.config.HotstarLogManager;
import com.hotstar.logging.config.LogArgs;
import com.hotstar.logging.sink.ISink;
import com.hotstar.logging.sink.SinkFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by devraj on 04/08/18.
 */
@Service
public class LoggerService {

    @Autowired
    private HotstarLogManager logManager;

    private String className ;

    public LoggerService(String className) {
        this.className = className;
    }

    public void info(String message) {

        final ISink sink = SinkFactory.getSink(this.logManager.getSinkType());

        LogArgs args = new LogArgs();
        args.setDate(new Date(System.currentTimeMillis()));
        // provide information to be logged
        //form message here
        args.setMessage(message);
        sink.save(args);

    }


    public void debug(String message) {

        // almost similar implementation like info

    }

    public void error(String message) {

        // almost similar implementation like info

    }

}
