package com.feign.demo.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;

/**
 * (Cinema)实体类
 *
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */
@Data
@TableName("cinema")
public class Cinema {

    @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;

    @TableField("movie")
    private String movie;

    @TableField("description")
    private String description;

    @TableField("rating")
    private BigDecimal rating;

}