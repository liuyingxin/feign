package com.feign.demo.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.feign.demo.web.entity.Information;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * (Information)Mapper类
 *
 * @author xin.framework
 * @since 2020-04-07 15:46:43
 */
@Mapper
@Repository
public interface InformationMapper extends BaseMapper<Information> {

}