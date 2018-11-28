package com.spittr.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * ${DESCRIPTION}
 *
 * @author sunjie
 * @create 2018-09-18 21:09
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND,reason = "spittle not found")
public class SpittleNotFoundException extends RuntimeException {
}
