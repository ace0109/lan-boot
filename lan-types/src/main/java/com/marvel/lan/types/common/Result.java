package com.marvel.lan.types.common;

public class Result<T> {
    private int code;

    private String msg;

    private T data;

    public Result()
    {
        this.code = 200;
        this.msg = "success";
        this.data = null;
    }

    public Result(T data)
    {
        this.code = 200;
        this.msg = "success";
        this.data = data;
    }

    public Result(int code, String msg)
    {
        this.code = code;
        this.msg = msg;
        this.data = null;
    }

    public Result(int code, String msg, T data)
    {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public int getCode()
    {
        return code;
    }

    public void setCode(int code)
    {
        this.code = code;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    @Override
    public String toString()
    {
        return "Result{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }

    public static <T> Result<T> success(T data)
    {
        return new Result<>(data);
    }

    public static <T> Result<T> success(int code, String msg, T data)
    {
        return new Result<>(code, msg, data);
    }

    public static <T> Result<T> fail(int code, String msg)
    {
        return new Result<>(code, msg);
    }

    public static <T> Result<T> fail(String msg)
    {
        return new Result<>(500, msg);
    }
}
