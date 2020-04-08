package com.feign.demo.web.controller;

import com.feign.demo.api.InformationApi;
import com.feign.demo.api.commons.ResponseResult;
import com.feign.demo.web.service.InformationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class InformationController implements InformationApi {
 @Autowired
    private InformationService informationservice;

    @Override
    public ResponseResult getInfoByName(String name) {
        return ResponseResult.success(informationservice.getInfoByName(name));
    }
}