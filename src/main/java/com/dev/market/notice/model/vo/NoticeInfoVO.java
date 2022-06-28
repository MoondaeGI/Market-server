package com.dev.market.notice.model.vo;

import com.dev.market.notice.util.enums.OpenYNEnum;
import lombok.Data;

@Data
public class NoticeInfoVO {
    String noticeTitle;
    String noticeContent;
    OpenYNEnum openYNEnum;
    String regDt;
}
