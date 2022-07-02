package com.dev.market.faq.controller;

import com.dev.market.faq.model.dao.FaqDAO;
import com.dev.market.faq.model.dto.FaqInsertRequestDTO;
import com.dev.market.faq.model.dto.FaqSelectRequestDTO;
import com.dev.market.faq.model.dto.FaqUpdateRequestDTO;
import com.dev.market.faq.model.vo.FaqInfoVO;
import com.dev.market.faq.service.FaqService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/faq")
@RestController
public class FaqController {
    @Autowired
    private FaqService faqService;

    @GetMapping("/info/list")
    public List<FaqInfoVO> selectFaqInfoList() {
        return faqService.selectFaqInfoList();
    }

    @GetMapping("/info")
    public FaqInfoVO selectFaqInfo(
            @RequestParam("faqNo") Long faqNo) {
        FaqSelectRequestDTO faqSelectRequestDTO = new FaqSelectRequestDTO();
        faqSelectRequestDTO.setFaqNo(faqNo);
        return faqService.selectFaqInfo(faqSelectRequestDTO);
    }

    @PostMapping("/info")
    public Boolean insertFaqInfo(
            @RequestBody FaqInsertRequestDTO faqInsertRequestDTO) {
        return faqService.insertFaqInfo(faqInsertRequestDTO);
    }

    @PutMapping("/info")
    public Boolean updateFaqInfo(
            @RequestBody FaqUpdateRequestDTO faqUpdateRequestDTO) {
        return faqService.updateFaqInfo(faqUpdateRequestDTO);
    }
}
