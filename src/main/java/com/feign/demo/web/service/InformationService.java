package com.feign.demo.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feign.demo.api.bean.vo.InformationVo;
import com.feign.demo.web.entity.Information;

/**
 * (Information)Service类
 *
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */
public interface InformationService extends IService<Information> {
    /**
     * 根据名称获取信息
     *
     * @param name
     */
    InformationVo getInfoByName(String name);
}