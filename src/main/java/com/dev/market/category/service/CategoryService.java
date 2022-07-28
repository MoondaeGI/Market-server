package com.dev.market.category.service;

import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategorySelectRequestDTO;
import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategoryUpdateRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategoryUpdateRequestDTO;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import com.dev.market.category.util.enums.UseYNEnum;

import java.util.List;

public interface CategoryService {
    List<TopCategoryInfoVO> selectTopCategoryInfoList();
    TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    TopCategoryInfoVO selectTopCategoryInfoFromName(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    String insertAndReturnNameTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO);
    TopCategoryInfoVO updateAndReturnTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);
    List<TopCategoryInfoVO> compareUpdateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);

    List<BottomCategoryInfoVO> selectBottomCategoryInfoList();
    Boolean updateBottomCategoryInfo(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO);

    BottomCategoryInfoVO insertAndReturnBottomCategoryInfo(BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO);
    UseYNEnum selectAndUpdateAndReturnBottomCategoryUseYNEnum(BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO);

    List<BottomCategoryInfoVO> selectAllCategoryInfoList();
}
