package com.feign.demo.api.commons;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * 返回对象类
 *
 * @param <T> 返回数据
 */
@ApiModel("响应对象")
@Data
public class ResponseResult<T> implements Serializable {

    /**
     * 返回码
     */
    @ApiModelProperty(name = "返回码", value = "响应状态码，200为成功", notes = "返回码")
    private Integer code;
    /**
     * 响应消息
     */
    @ApiModelProperty(name = "返回消息", value = "返回消息", notes = "返回消息")
    private String msg;

    /**
     * 返回的数据
     */
    @ApiModelProperty(name = "返回数据", value = "业务数据", dataType = "java.lang.Object")

    private T data;
    public ResponseResult() {
    }

    public ResponseResult(CodeMessage codeMessage, T data) {
        handleStatus(codeMessage);
        this.data = data;
    }

    public ResponseResult(CodeMessage codeMessage) {
        handleStatus(codeMessage);
    }

    /**
     * 包装成功返回的对象
     */
    public static <T> ResponseResult<T> success(T data) {
        return new ResponseResult<>(SystemCodes.SUCCESS, data);
    }

    /**
     * 处理状态
     *
     * @param codeMessage 返回码
     */
    private void handleStatus(CodeMessage codeMessage) {
        this.code = codeMessage.getCode();
        this.msg = codeMessage.getMessage();
    }

    /**
     * 包装成功返回的对象，不带数据
     */
    public static ResponseResult success() {
        return new ResponseResult(SystemCodes.SUCCESS);
    }


    /**
     * 自定义返回message
     *
     * @param message message
     * @return ResponseResult
     */
    public static ResponseResult success(String message) {
        ResponseResult responseResult = new ResponseResult(SystemCodes.SUCCESS);
        responseResult.setMsg(message);
        return responseResult;
    }

}

