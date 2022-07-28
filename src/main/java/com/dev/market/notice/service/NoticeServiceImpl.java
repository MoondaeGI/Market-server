package com.dev.market.notice.service;

import com.dev.market.notice.model.dao.NoticeDAO;
import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectFromSKRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService{
    @Autowired
    private NoticeDAO noticeDAO;

    @Override
    public List<NoticeInfoVO> selectNoticeInfoList() {
        return noticeDAO.selectNoticeInfoList();
    }

    @Override
    public String countNoticeInfoList() {
        List<NoticeInfoVO> noticeInfoVOList = noticeDAO.selectNoticeInfoList();
        return "현재 공지사항은 " + noticeInfoVOList.size() + "개있습니다.";
    }

    @Override
    public NoticeInfoVO selectNoticeInfo(NoticeSelectRequestDTO noticeSelectRequestDTO) {
        return noticeDAO.selectNoticeInfo(noticeSelectRequestDTO);
    }

    @Override
    public Boolean isInsertNoticeInfo(NoticeInsertRequestDTO noticeInsertRequestDTO) {
        return noticeDAO.insertNoticeInfo(noticeInsertRequestDTO) == 1;
    }

    @Override
    public Boolean isUpdateNoticeInfo(NoticeUpdateRequestDTO noticeUpdateRequestDTO) {
        return noticeDAO.updateNoticeInfo(noticeUpdateRequestDTO) == 1;
    }

    @Override
    public NoticeInfoVO searchNoticeInfoFromTitle(NoticeSelectFromSKRequestDTO noticeSelectFromSKRequestDTO) {
        return noticeDAO.searchNoticeInfoFromTitle(noticeSelectFromSKRequestDTO);
    }
}
