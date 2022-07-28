package com.dev.market.notice.controller;

import com.dev.market.notice.model.dto.NoticeInsertRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectFromSKRequestDTO;
import com.dev.market.notice.model.dto.NoticeSelectRequestDTO;
import com.dev.market.notice.model.dto.NoticeUpdateRequestDTO;
import com.dev.market.notice.model.vo.NoticeInfoVO;
import com.dev.market.notice.service.NoticeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Api(tags = {"Notice API"})
@RequestMapping("/notice")
@RestController
public class NoticeController {
    @Autowired
    private NoticeService noticeService;

    @ApiOperation(value = "공지사항 정보 리스트 조회", notes = "공지사항에 대한 정보를 리스트로 조회하는 API")
    @GetMapping("/info/list")
    public List<NoticeInfoVO> selectNoticeInfoList() {
        return noticeService.selectNoticeInfoList();
    }

    @ApiOperation(value = "공지사항의 개수를 조회", notes = "현재 공지사항의 개수를 조회하는 API")
    @GetMapping("/info/list/count")
    public String countNoticeInfoList() {
        return noticeService.countNoticeInfoList();
    }

    @ApiOperation(value = "공지사항 정보 조회", notes = "공지사항에 대한 정보를 조회하는 API")
    @GetMapping("/info")
    public NoticeInfoVO selectNoticeInfo(
            @ApiParam(name = "noticeNo", value = "공지사항 번호", example = "1", required = true)
            @RequestParam("no") Long noticeNo) {
        NoticeSelectRequestDTO noticeSelectRequestDTO = new NoticeSelectRequestDTO();
        noticeSelectRequestDTO.setNoticeNo(noticeNo);

        return noticeService.selectNoticeInfo(noticeSelectRequestDTO);
    }

    @ApiOperation(value = "공지사항 정보 삽입", notes = "공지사항 정보를 삽입하는 API")
    @PostMapping("/info")
    public Boolean insertNoticeInfo(
            @ApiParam(name = "noticeInsertRequestDTO",
                    value = "공지사항 삽입 객체 정보", required = true)
            @RequestBody NoticeInsertRequestDTO noticeInsertRequestDTO) {
        return noticeService.isInsertNoticeInfo(noticeInsertRequestDTO);
    }

    @ApiOperation(value = "공지사항 정보 수정", notes = "공지사항 정보를 수정하는 API")
    @PutMapping("/info")
    public Boolean updateNoticeInfo(
            @ApiParam(name = "noticeUpdateRequestDTO",
                    value = "공지사항 수정 객체 정보", required = true)
            @RequestBody NoticeUpdateRequestDTO noticeUpdateRequestDTO) {
        return noticeService.isUpdateNoticeInfo(noticeUpdateRequestDTO);
    }

    @ApiOperation(value = "공지사항 정보 키워드로 조회", notes = "공지사항 정보를 키워드로 조회하는 API")
    @PostMapping("/info/search")
    public NoticeInfoVO searchNoticeInfoFromTitle(
            @ApiParam(name = "noticeSelectFromSKRequestDTO",
                    value = "공지사항 키워드 조회 객체 정보", required = true)
            @RequestBody NoticeSelectFromSKRequestDTO noticeSelectFromSKRequestDTO) {
        return noticeService.searchNoticeInfoFromTitle(noticeSelectFromSKRequestDTO);
    }
}
