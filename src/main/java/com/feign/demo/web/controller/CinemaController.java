package com.feign.demo.web.controller;

import com.feign.demo.api.CinemaApi;
import com.feign.demo.api.bean.dto.CinemaDto;
import com.feign.demo.api.commons.ResponseResult;
import com.feign.demo.web.service.CinemaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class CinemaController implements CinemaApi {
 @Autowired
    private CinemaService cinemaservice;

    @Override
    public ResponseResult saveCinema(CinemaDto cinemaDto) {
        cinemaservice.saveCinema(cinemaDto);
        return ResponseResult.success();
    }
}