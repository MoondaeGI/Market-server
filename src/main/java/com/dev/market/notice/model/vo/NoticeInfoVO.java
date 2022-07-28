package com.dev.market.notice.model.vo;

import com.dev.market.notice.util.enums.OpenYNEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "NoticeInfoVO", description = "공지사항 정보를 저장하는 VO")
@Data
public class NoticeInfoVO {
    @ApiModelProperty(value = "공지사항 제목", example = "테스트", required = true)
    String noticeTitle;

    @ApiModelProperty(value = "공지사항 내용", example = "테스트", required = true)
    String noticeContent;

    @ApiModelProperty(value = "공지사항 공개 여부", example = "Y", required = true)
    OpenYNEnum openYNEnum;

    @ApiModelProperty(value = "등록 날짜", example = "2022-07-28 00:00:00", required = true)
    String regDt;
}
