package com.marvel.lan.application.excepion;

import com.marvel.lan.types.common.ErrorCode;
import com.marvel.lan.types.common.Result;
import com.marvel.lan.types.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@Slf4j
@RestControllerAdvice
public class GlobalExceptionHandler {

    // 处理自定义的业务异常
    @ExceptionHandler(BusinessException.class)
    @ResponseStatus(HttpStatus.OK)
    public Result<Void, Void> handleBusinessException(BusinessException ex) {
        log.error("Business Exception", ex);
        return Result.error(ex.getCode(), ex.getMessage());
    }

    // 处理所有其他异常
    @ExceptionHandler(Exception.class)
    public Result<Void, Void> handleGlobalException(Exception ex) {
        log.error("Exception", ex);
        return Result.error(ErrorCode.INTERNAL_SERVER_ERROR.getCode(), ErrorCode.INTERNAL_SERVER_ERROR.getMessage());
    }

}
