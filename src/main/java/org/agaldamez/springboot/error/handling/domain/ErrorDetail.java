package org.agaldamez.springboot.error.handling.domain;

import lombok.*;
import org.springframework.http.HttpStatus;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ErrorDetail {

    private String detail;
    private String message;
    private Date dateError;
    private HttpStatus status;
    private Integer statusCode;

}
