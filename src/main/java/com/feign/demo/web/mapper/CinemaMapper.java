package com.feign.demo.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feign.demo.web.entity.Cinema;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (Cinema)Mapper类
 *
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */
@Mapper
@Repository
public interface CinemaMapper extends BaseMapper<Cinema> {

}