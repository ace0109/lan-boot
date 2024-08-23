package com.marvel.lan.types.common;

public class Result<T, U> {
    private String code;

    private String message;

    private T data;

    private U extend;

    public Result(String code, String message, T data, U extend)
    {
        this.code = code;
        this.message = message;
        this.data = data;
        this.extend = extend;
    }

    // 成功方法，只包含数据
    public static <T> Result<T, Void> success(T data) {
        return new Result<>("00000", "Success", data, null);
    }

    // 成功方法，包含数据和扩展信息
    public static <T, U> Result<T, U> success(T data, U extend) {
        return new Result<>("00000", "Success", data, extend);
    }

    // 失败方法，只包含错误信息
    public static <T> Result<T, Void> error(String code, String message) {
        return new Result<>(code, message, null, null);
    }

    // 失败方法，包含错误信息和扩展信息
    public static <T, U> Result<T, U> error(String code, String message, U extend) {
        return new Result<>(code, message, null, extend);
    }

    // Getter 和 Setter 方法
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public U getExtend() {
        return extend;
    }

    public void setExtend(U extend) {
        this.extend = extend;
    }

    @Override
    public String toString() {
        return "Result{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                ", extend=" + extend +
                '}';
    }
}
