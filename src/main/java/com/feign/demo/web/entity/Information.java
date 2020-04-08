package com.feign.demo.web.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * (Information)实体类
 *
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */
@Data
@TableName("usr_information")
public class Information {
            
            @TableId(type = IdType.AUTO)
    @TableField("id")
    private Integer id;
            
            @TableField("name")
    private String name;
            
            @TableField("message")
    private String message;
            
            @TableField("pnone")
    private String pnone;
            
            @TableField("age")
    private Integer age;

}