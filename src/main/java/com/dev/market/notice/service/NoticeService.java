package com.dev.market.notice.service;

import com.dev.market.notice.model.dao.NoticeDAO;
import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;

import java.util.List;

public interface NoticeService {
    String countNoticeInfoList();
    List<NoticeInfoVO> selectNoticeInfoList();
    NoticeInfoVO selectNoticeInfo(NoticeSelectRequestDTO noticeSelectRequestDTO);
    Boolean isInsertNoticeInfo(NoticeInsertRequestDTO noticeInsertRequestDTO);
    Boolean isUpdateNoticeInfo(NoticeUpdateRequestDTO noticeUpdateRequestDTO);
    NoticeInfoVO searchNoticeInfoFromTitle(NoticeSelectRequestDTO noticeSelectRequestDTO);
}
