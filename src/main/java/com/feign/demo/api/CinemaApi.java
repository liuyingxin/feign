package com.feign.demo.api;

import com.feign.demo.api.bean.dto.CinemaDto;
import com.feign.demo.api.commons.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * (Cinema)API类
 *
 * @author xin.framework
 * @since 2020-04-07 15:59:30
 */

@Api(tags = "电影信息模块")
@RequestMapping(value = {"/Cinema"})
public interface CinemaApi {
    @ApiOperation(value = "保存电影信息")
    @PostMapping("/save")
    ResponseResult saveCinema(CinemaDto cinemaDto);
}