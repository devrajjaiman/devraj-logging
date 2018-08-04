package com.hotstar.logging.sink;

import com.hotstar.logging.config.LogArgs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by devraj on 04/08/18.
 */
@Service
public class SinkFactory {

    @Autowired
    private List<ISink> sinkList;

    private static Map<String, ISink> sinkCache = new HashMap<>();

    @PostConstruct
    public void init(){
        sinkCache = this.sinkList.stream().collect(Collectors.toMap(ISink::getSinkType, s -> s));
    }

    public static ISink getSink(String sinkType) {
        final ISink sink = sinkCache.get(sinkType);
        if(Objects.isNull(sink)){
            throw new RuntimeException("Sink type not supported: "+sinkType);
        }
        return sink;
    }
}
