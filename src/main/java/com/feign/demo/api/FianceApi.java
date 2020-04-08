package com.feign.demo.api;

import com.feign.demo.api.commons.ResponseResult;
import com.feign.demo.web.feign.PlanConfirmDto;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Api(tags = "feign获取信息")
@RequestMapping(value = {"/fin"})
public interface FianceApi {

    /**
     * 获取详情
     * @param planConfirmDto
     * @return
     */
    @ApiOperation(value = "feign获取详情信息")
    @RequestMapping(value = "/finance/my/get_detail", method = RequestMethod.POST)
    ResponseResult getInfo(@RequestBody PlanConfirmDto planConfirmDto);
}
