package com.dev.market.category.controller;

import com.dev.market.category.model.dto.*;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import com.dev.market.category.service.CategoryService;
import com.dev.market.category.util.enums.UseYNEnum;
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

    @GetMapping("/bottom/info/list")
    public List<BottomCategoryInfoVO> selectBottomCategoryInfoList() {
        return categoryService.selectBottomCategoryInfoList();
    }

    @PostMapping("bottom/info")
    public BottomCategoryInfoVO insertAndReturnBottomCategoryInfo(
            @RequestBody BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO) {
        return categoryService.insertAndReturnBottomCategoryInfo(bottomCategoryInsertRequestDTO);
    }

    @PutMapping("bottom/info")
    public Boolean updateBottomCategoryInfo(
            @RequestBody BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO) {
        return categoryService.updateBottomCategoryInfo(bottomCategoryUpdateRequestDTO);
    }

    @PutMapping("bottom/info/useYn")
    public UseYNEnum selectAndUpdateBottomCategoryUseYNEnum(
            @RequestBody BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO) {
        return categoryService.selectAndUpdateAndReturnBottomCategoryUseYNEnum(bottomCategorySelectRequestDTO);
    }

    @GetMapping("all/info/list")
    public List<BottomCategoryInfoVO> selectAllCategoryInfoList() {
        return categoryService.selectAllCategoryInfoList();
    }
}
