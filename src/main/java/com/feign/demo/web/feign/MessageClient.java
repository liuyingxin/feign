package com.feign.demo.web.feign;

import com.feign.demo.api.commons.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 调用服务
 *
 */
@FeignClient(value = "finance", url = "${external.fiance.url:}")
@RequestMapping(headers = {"system_id=finance"})
public interface MessageClient {
    /**
     * 获取详情
     * @param planConfirmDto
     * @return
     */
    @RequestMapping(value = "/finance/my/get_detail", method = RequestMethod.POST)
    ResponseResult orderInfo(@RequestBody PlanConfirmDto planConfirmDto);


}