package com.feign.demo.api.bean.vo;
/**
 * (Information)Vo类
 @ApiModelProperty(value = 'ID信息')
 private Integer Id;)
 *
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

@Data
public class InformationVo implements Serializable  {
 @TableId(type = IdType.AUTO)
  @ApiModelProperty(value ="id")
 private Integer id;

  @ApiModelProperty(value ="姓名")
 private String name;

  @ApiModelProperty(value ="信息")
 private String message;

  @ApiModelProperty(value ="电话")
 private String pnone;

  @ApiModelProperty(value ="年龄")
 private Integer age;
}