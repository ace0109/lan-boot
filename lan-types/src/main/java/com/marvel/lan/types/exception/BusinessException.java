package com.marvel.lan.types.exception;

import com.marvel.lan.types.common.ErrorCode;

public class BusinessException extends RuntimeException{

    private final ErrorCode errorCode;

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public String getCode() {
        return errorCode.getCode();
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    @Override
    public String toString() {
        return "BusinessException{" +
                "code=" + errorCode.getCode() +
                ", message=" + errorCode.getMessage() +
                '}';
    }

}
