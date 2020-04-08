package com.feign.demo.web.feign;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

@Data
@Getter
public class PlanConfirmDto implements Serializable {
    private Integer Id;
}
