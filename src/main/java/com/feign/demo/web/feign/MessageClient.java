package com.feign.demo.web.feign;

import com.feign.demo.api.commons.ResponseResult;
import com.feign.demo.web.feign.dto.PlanConfirmDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * feign单独使用---调用服务
    1、在application.properties配置---external.fiance.url=http://localhost:8080
        或者直接写入url =http://localhost:8080
    2、相当于https请求访问http://localhost:8080/finance/my/get_detail访问获得信息
    3、system_id加签验签使用
 */
@FeignClient(value = "finance", url = "${external.fiance.url:}")
@RequestMapping(headers = {"system_id=finance"})
public interface MessageClient {
    /**
     * 获取详情
     *
     * @param planConfirmDto
     * @return
     */
    @RequestMapping(value = "/finance/my/get_detail", method = RequestMethod.POST)
    ResponseResult orderInfo(@RequestBody PlanConfirmDto planConfirmDto);


}