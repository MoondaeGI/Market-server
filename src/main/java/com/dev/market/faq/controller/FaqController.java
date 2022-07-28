package com.dev.market.faq.controller;

import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;
import com.dev.market.faq.service.FaqService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = {"FaqAPI"})
@RequestMapping("/faq")
@RestController
public class FaqController {
    @Autowired
    private FaqService faqService;

    @ApiOperation(value = "FAQ 정보 리스트 조회", notes = "FAQ 정보에 대한 리스트를 조회하는 API")
    @GetMapping("/info/list")
    public List<FaqInfoVO> selectFaqInfoList() {
        return faqService.selectFaqInfoList();
    }

    @ApiOperation(value = "FAQ 정보 조회", notes = "FAQ 정보를 조회하는 API")
    @GetMapping("/info")
    public FaqInfoVO selectFaqInfo(
            @ApiParam(name = "faqNo", value = "FAQ 번호", example = "1", required = true)
            @RequestParam("no") Long faqNo) {
        FaqSelectRequestDTO faqSelectRequestDTO = new FaqSelectRequestDTO();
        faqSelectRequestDTO.setFaqNo(faqNo);
        return faqService.selectFaqInfo(faqSelectRequestDTO);
    }

    @ApiOperation(value = "FAQ 정보 삽입", notes = "FAQ 정보를 삽입하는 API")
    @PostMapping("/info")
    public Boolean insertFaqInfo(
            @ApiParam(name = "faqInsertRequestDTO", value = "FAQ 삽입 객체 정보", required = true)
            @RequestBody FaqInsertRequestDTO faqInsertRequestDTO) {
        return faqService.insertFaqInfo(faqInsertRequestDTO);
    }

    @ApiOperation(value = "FAQ 정보 수정", notes = "FAQ 정보를 수정하는 API")
    @PutMapping("/info")
    public Boolean updateFaqInfo(
            @ApiParam(name = "faqUpdateRequestDTO", value = "FAQ 수정 객체 정보", required = true)
            @RequestBody FaqUpdateRequestDTO faqUpdateRequestDTO) {
        return faqService.updateFaqInfo(faqUpdateRequestDTO);
    }
}
