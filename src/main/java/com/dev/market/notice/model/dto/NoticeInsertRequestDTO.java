package com.dev.market.notice.model.dto;

import com.dev.market.notice.util.enums.OpenYNEnum;
import lombok.Data;

@Data
public class NoticeInsertRequestDTO {
    String noticeTitle;
    String noticeContent;
    OpenYNEnum openYNEnum;
}
