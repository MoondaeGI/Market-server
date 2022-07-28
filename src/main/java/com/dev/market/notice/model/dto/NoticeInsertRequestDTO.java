package com.dev.market.notice.model.dto;

import com.dev.market.notice.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "NoticeInsertRequestDTO", description = "공지사항 정보를 삽입하는 API")
@Data
public class NoticeInsertRequestDTO {
    @ApiModelProperty(value = "공지사항 제목", example = "테스트", required = true)
    String noticeTitle;

    @ApiModelProperty(value = "공지사항 내용", example = "테스트", required = true)
    String noticeContent;

    @ApiModelProperty(value = "공지사항 공개 여부", example = "Y", required = true)
    OpenYNEnum openYNEnum;
}
