package com.dev.market.category.model.dao;

import com.dev.market.category.model.dto.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.TopCategoryUpdateRequestDTO;
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
}
