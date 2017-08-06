package com.snowman.blog.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义异常类(继承运行时异常)
 * @author SnowMan
 * @version 2017/07/14
 */
public class BlogException extends Exception{

    private static final long serialVersionUID = -5809073763818870864L;

    /**
     * 错误编码
     */
    private String errorCode;

    /**
     * 消息是否为属性文件中的Key
     */
    private boolean propertiesKey = true;

    /**
     * 用于报错多个异常
     */
    private List<Throwable> causes = new ArrayList<Throwable>();

    /**
     * 构造一个基本异常.
     *
     * @param message
     *            信息描述
     */
    public BlogException(String message) {
        super(message);
    }

    /**
     * 构造函数添加所有异常
     *
     * @param _causes
     */
    public BlogException(List<? extends Throwable> _causes) {
        this.getCauses().addAll(_causes);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode
     *            错误编码
     * @param message
     *            信息描述
     */
    public BlogException(String errorCode, String message) {
        this(errorCode, message, true);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode
     *            错误编码
     * @param message
     *            信息描述
     */
    public BlogException(String errorCode, String message, Throwable cause) {
        this(errorCode, message, cause, true);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode
     *            错误编码
     * @param message
     *            信息描述
     * @param propertiesKey
     *            消息是否为属性文件中的Key
     */
    public BlogException(String errorCode, String message, boolean propertiesKey) {
        super(message);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }

    /**
     * 构造一个基本异常.
     *
     * @param errorCode
     *            错误编码
     * @param message
     *            信息描述
     */
    public BlogException(String errorCode, String message, Throwable cause, boolean propertiesKey) {
        super(message, cause);
        this.setErrorCode(errorCode);
        this.setPropertiesKey(propertiesKey);
    }

    /**
     * 构造一个基本异常.
     *
     * @param message
     *            信息描述
     * @param cause
     *            根异常类（可以存入任何异常）
     */
    public BlogException(String message, Throwable cause) {
        super(message, cause);
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public boolean isPropertiesKey() {
        return propertiesKey;
    }

    public void setPropertiesKey(boolean propertiesKey) {
        this.propertiesKey = propertiesKey;
    }

    public List<Throwable> getCauses() {
        return causes;
    }

    public void setCauses(List<Throwable> causes) {
        this.causes = causes;
    }
}
