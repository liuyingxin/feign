package com.feign.demo.web.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.feign.demo.api.bean.dto.CinemaDto;
import com.feign.demo.web.entity.Cinema;

/**
 * (Cinema)Service类
 *
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */
public interface CinemaService extends IService<Cinema> {
   void saveCinema(CinemaDto cinemaDto);

}