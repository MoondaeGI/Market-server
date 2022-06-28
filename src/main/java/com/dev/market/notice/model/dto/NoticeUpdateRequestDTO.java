package com.dev.market.notice.model.dto;

import com.dev.market.notice.util.enums.OpenYNEnum;
import lombok.Data;

@Data
public class NoticeUpdateRequestDTO {
    Long noticeNo;
    String noticeTitle;
    String noticeContent;
    OpenYNEnum openYNEnum;
}
