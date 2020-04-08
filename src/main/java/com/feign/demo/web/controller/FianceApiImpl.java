package com.feign.demo.web.controller;

import com.feign.demo.api.FianceApi;
import com.feign.demo.api.commons.ResponseResult;
import com.feign.demo.web.feign.MessageClient;
import com.feign.demo.web.feign.PlanConfirmDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class FianceApiImpl implements FianceApi {
    @Autowired
    private MessageClient messageClient;

    /**
     * 获取详情
     *
     * @param planConfirmDto
     * @return
     */
    @Override
    public ResponseResult getInfo(PlanConfirmDto planConfirmDto) {
        return messageClient.orderInfo(planConfirmDto);
    }
}
