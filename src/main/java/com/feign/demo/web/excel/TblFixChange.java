package com.feign.demo.web.excel;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 批量导入的实体类
 * @author 
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TblFixChange implements Serializable {

    private static final long serialVersionUID = 1L;
    //城市姓名
    private String cityName;




}