package com.dev.market.faq.model.dto;

import com.dev.market.faq.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "FaqInsertRequestDTO", description = "FAQ에 대한 정보를 삽입하는 DTO")
@Data
public class FaqInsertRequestDTO {
    @ApiModelProperty(value = "FAQ 제목", example = "테스트", required = true)
    String faqTitle;

    @ApiModelProperty(value = "FAQ 내용", example = "테스트", required = true)
    String faqContent;

    @ApiModelProperty(value = "FAQ 공개 여부", example = "Y", required = true)
    OpenYNEnum openYNEnum;
}
