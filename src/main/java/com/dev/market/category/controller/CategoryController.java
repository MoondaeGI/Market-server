package com.dev.market.category.controller;

import com.dev.market.category.model.dto.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.TopCategoryUpdateRequestDTO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import com.dev.market.category.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/top/info/list")
    public List<TopCategoryInfoVO> selectTopCategoryInfoList() {
        return categoryService.selectTopCategoryInfoList();
    }

    @GetMapping("top/info")
    public TopCategoryInfoVO selectTopCategoryInfo(
            @RequestParam("no") Integer pdCt1No) {
        TopCategorySelectRequestDTO topCategorySelectRequestDTO = new TopCategorySelectRequestDTO();
        topCategorySelectRequestDTO.setPdCt1No(pdCt1No);

        return categoryService.selectTopCategoryInfo(topCategorySelectRequestDTO);
    }

    @GetMapping("top/info/searching")
    public TopCategoryInfoVO selectTopCategoryInfoFromName(
            @RequestParam("name") String pdCt1SearchingNameKey) {
        TopCategorySelectRequestDTO topCategorySelectRequestDTO = new TopCategorySelectRequestDTO();
        topCategorySelectRequestDTO.setPdCt1SearchingNameKey(pdCt1SearchingNameKey);

        return categoryService.selectTopCategoryInfoFromName(topCategorySelectRequestDTO);
    }

    @PostMapping("top/info")
    public String InsertAndReturnNameTopCategoryInfo(
            @RequestBody TopCategoryInsertRequestDTO topCategoryInsertRequestDTO) {
        return categoryService.insertAndReturnNameTopCategoryInfo(topCategoryInsertRequestDTO);
    }

    @PutMapping("top/info")
    public TopCategoryInfoVO updateAndReturnTopCategoryInfo(
            @RequestBody TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO) {
        return categoryService.updateAndReturnTopCategoryInfo(topCategoryUpdateRequestDTO);
    }

    @PutMapping("top/info/compare")
    public List<TopCategoryInfoVO> CompareUpdateTopCategoryInfo(
            @RequestBody TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO) {
        return categoryService.compareUpdateTopCategoryInfo(topCategoryUpdateRequestDTO);
    }
}