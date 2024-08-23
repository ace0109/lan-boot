package com.marvel.lan.types.common;

public enum ErrorCode {
    // 用户模块相关错误
    USER_NOT_FOUND("USER_404", "User not found"),
    INVALID_USER_INPUT("USER_400", "Invalid user input"),

    // 订单模块相关错误
    ORDER_NOT_FOUND("ORDER_404", "Order not found"),
    PAYMENT_FAILED("ORDER_203", "Payment failed"),

    // 系统通用错误
    INTERNAL_SERVER_ERROR("SYS_500", "Internal server error"),
    BAD_REQUEST("SYS_404", "Bad request");

    private final String code;
    private final String message;

    ErrorCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
