package com.dev.market.notice.controller;

import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import com.dev.market.notice.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/notice")
@RestController
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @GetMapping("/info/list")
    public List<NoticeInfoVO> selectNoticeInfoList() {
        return noticeService.selectNoticeInfoList();
    }

    @GetMapping("/info/list/count")
    public String countNoticeInfoList() {
        return noticeService.countNoticeInfoList();
    }

    @GetMapping("/info")
    public NoticeInfoVO selectNoticeInfo(@RequestParam("noticeNo") Long noticeNo) {
        NoticeSelectRequestDTO noticeSelectRequestDTO = new NoticeSelectRequestDTO();
        noticeSelectRequestDTO.setNoticeNo(noticeNo);

        return noticeService.selectNoticeInfo(noticeSelectRequestDTO);
    }

    @PostMapping("/info")
    public Boolean isInsertNoticeInfo(
            @RequestBody NoticeInsertRequestDTO noticeInsertRequestDTO) {
        return noticeService.isInsertNoticeInfo(noticeInsertRequestDTO);
    }

    @PutMapping("/info")
    public Boolean isUpdateNoticeInfo(
            @RequestBody NoticeUpdateRequestDTO noticeUpdateRequestDTO) {
        return noticeService.isUpdateNoticeInfo(noticeUpdateRequestDTO);
    }

    @PostMapping("/info/search")
    public NoticeInfoVO searchNoticeInfoFromTitle(
            @RequestBody NoticeSelectRequestDTO noticeSelectRequestDTO) {
        return noticeService.searchNoticeInfoFromTitle(noticeSelectRequestDTO);
    }
}
