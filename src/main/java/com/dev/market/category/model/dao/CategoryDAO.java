package com.dev.market.category.model.dao;

import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategorySelectRequestDTO;
import com.dev.market.category.model.dto.bottomCategoryRequestDTO.BottomCategoryUpdateRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.topCategoryRequestDTO.TopCategoryUpdateRequestDTO;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CategoryDAO {
    List<TopCategoryInfoVO> selectTopCategoryInfoList();
    TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    TopCategoryInfoVO selectTopCategoryInfoFromName(TopCategorySelectRequestDTO topCategorySelectRequestDTO);
    Integer insertTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO);
    Integer updateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO);

    List<BottomCategoryInfoVO> selectBottomCategoryInfoList();
    BottomCategoryInfoVO selectBottomCategoryInfoFromName(BottomCategorySelectRequestDTO bottomCategorySelectRequestDTO);
    Integer insertBottomCategoryInfo(BottomCategoryInsertRequestDTO bottomCategoryInsertRequestDTO);
    Integer updateBottomCategoryInfo(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO);
    Integer updateBottomCategoryUseYNEnum(BottomCategoryUpdateRequestDTO bottomCategoryUpdateRequestDTO);

    List<BottomCategoryInfoVO> selectAllCategoryInfoList();
}
