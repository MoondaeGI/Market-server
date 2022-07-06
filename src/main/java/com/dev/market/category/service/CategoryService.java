package com.dev.market.category.service;

import com.dev.market.category.model.dto.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.TopCategoryUpdateRequestDTO;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;

import java.util.List;

public interface CategoryService {
    List<TopCategoryInfoVO> selectTopCategoryInfoList();
    TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    TopCategoryInfoVO selectTopCategoryInfoFromName(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    String insertAndReturnNameTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO);
    TopCategoryInfoVO updateAndReturnTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);
    List<TopCategoryInfoVO> compareUpdateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);

    List<BottomCategoryInfoVO> selectBottomCategoryInfoList();
    List<BottomCategoryInfoVO> selectAllCategoryInfoList();
}
