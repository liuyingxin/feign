package com.feign.demo.api.bean.dto;
/**
 * (Cinema)dto 类
 *
 * @ApiModelProperty(value = 'ID信息')
 * private Integer Id;)
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CinemaDto implements Serializable {

    @ApiModelProperty(value = "电影")
    private String movie;

    @ApiModelProperty(value = "描述")
    private String description;

    @ApiModelProperty(value = "评分")
    private BigDecimal rating;

}