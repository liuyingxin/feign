package com.feign.demo.web.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.feign.demo.api.bean.dto.CinemaDto;
import com.feign.demo.web.entity.Cinema;
import com.feign.demo.web.mapper.CinemaMapper;
import com.feign.demo.web.service.CinemaService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * (Cinema)ServiceImpl类
 *
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */
@Service
public class CinemaServiceImpl extends ServiceImpl<CinemaMapper, Cinema> implements CinemaService {
    @Autowired
    private CinemaMapper cinemaMapper;

    @Override
    public void saveCinema(CinemaDto cinemaDto) {

        Optional.ofNullable(cinemaDto);

        Cinema c = new Cinema();
        BeanUtils.copyProperties(cinemaDto, c);
        int i = cinemaMapper.insert(c);

    }
}