package com.feign.demo.api.bean.dto;
/**
 * (Information)dto 类
 *
 * @ApiModelProperty(value = 'ID信息')
 * private Integer Id;)
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class InformationDto implements Serializable {

    @ApiModelProperty(value = "姓名")
    private String name;
}