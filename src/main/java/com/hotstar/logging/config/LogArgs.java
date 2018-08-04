package com.hotstar.logging.config;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

/**
 * Created by devraj on 04/08/18.
 */
@Getter @Setter
@NoArgsConstructor
public class LogArgs {

    private String requestIdentifier;
    private String message;
    private Date date;

}
