package com.dev.market.notice.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "NoticeSelectFromSKRequestDTO", description = "공지사항을 키워드로 조회하는 DTO")
@Data
public class NoticeSelectFromSKRequestDTO {

    @ApiModelProperty(value = "공지사항 검색 키워드", example = "테스트", required = true)
    String noticeSearchingKey;
}
