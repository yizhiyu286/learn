package com.yzy.exception;

/**
 * 自定义异常
 */
public class CustomException extends RuntimeException {
    private Integer code;

    public CustomException(Exception e) {
        super(e);
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Integer code, String msg) {
        super(msg);
        this.code = code;
    }

    public Integer getCode() {
        return this.code;
    }
}
