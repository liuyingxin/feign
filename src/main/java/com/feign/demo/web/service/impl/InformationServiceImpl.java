package com.feign.demo.web.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feign.demo.api.bean.vo.InformationVo;
import com.feign.demo.web.entity.Information;
import com.feign.demo.web.mapper.InformationMapper;
import com.feign.demo.web.service.InformationService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * (Information)ServiceImpl类
 *
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */
@Service
public class InformationServiceImpl extends ServiceImpl<InformationMapper, Information> implements InformationService {

    @Autowired
    private InformationMapper informationMapper;

    @Override
    public InformationVo getInfoByName(String name) {
        Information information = informationMapper.selectOne(new QueryWrapper<Information>().lambda().eq(Information::getName, name));
        InformationVo vi = new InformationVo();
        Optional.ofNullable(information).ifPresent(V -> {
                    BeanUtils.copyProperties(V, vi);
                }
        );
        return vi;
    }
}