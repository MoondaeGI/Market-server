package com.dev.market.faq.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "FAQSelectRequestDTO", description = "FAQ에 대한 정보를 조회하는 DTO")
@Data
public class FaqSelectRequestDTO {
    @ApiModelProperty(value = "FAQ 번호", example = "1", required = true)
    Long faqNo;
}
