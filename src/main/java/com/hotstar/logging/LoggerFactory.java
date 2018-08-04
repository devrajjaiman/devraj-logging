package com.hotstar.logging;

import com.hotstar.logging.config.HotstarLogManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by devraj on 04/08/18.
 */
@Service
public class LoggerFactory {

    public static LoggerService get(Class kclass) {
        return new LoggerService(kclass.getName());
    }
}
