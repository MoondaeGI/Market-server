package com.dev.market.category.service;

import com.dev.market.category.model.dao.CategoryDAO;
import com.dev.market.category.model.dto.TopCategoryInsertRequestDTO;
import com.dev.market.category.model.dto.TopCategorySelectRequestDTO;
import com.dev.market.category.model.dto.TopCategoryUpdateRequestDTO;
import com.dev.market.category.model.vo.BottomCategoryInfoVO;
import com.dev.market.category.model.vo.TopCategoryInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Autowired
    private CategoryDAO categoryDAO;

    @Override
    public List<TopCategoryInfoVO> selectTopCategoryInfoList() {
        return categoryDAO.selectTopCategoryInfoList();
    }

    @Override
    public TopCategoryInfoVO selectTopCategoryInfo(TopCategorySelectRequestDTO topCategorySelectRequestDTO) {
        return categoryDAO.selectTopCategoryInfo(topCategorySelectRequestDTO);
    }

    @Override
    public TopCategoryInfoVO selectTopCategoryInfoFromName(TopCategorySelectRequestDTO topCategorySelectRequestDTO) {
        return categoryDAO.selectTopCategoryInfoFromName(topCategorySelectRequestDTO);
    }

    @Override
    public String insertAndReturnNameTopCategoryInfo(TopCategoryInsertRequestDTO topCategoryInsertRequestDTO) {
        categoryDAO.insertTopCategoryInfo(topCategoryInsertRequestDTO);
        String newTopCategoryName = topCategoryInsertRequestDTO.getPdCt1Name();

        return "추가된 카테고리는 " + newTopCategoryName + "입니다.";
    }

    @Override
    public TopCategoryInfoVO updateAndReturnTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO) {
        TopCategorySelectRequestDTO topCategorySelectRequestDTO = new TopCategorySelectRequestDTO();

        categoryDAO.updateTopCategoryInfo(topCategoryUpdateRequestDTO);
        topCategorySelectRequestDTO.setPdCt1No(topCategoryUpdateRequestDTO.getPdCt1No());

        return categoryDAO.selectTopCategoryInfo(topCategorySelectRequestDTO);
    }

    @Override
    public List<TopCategoryInfoVO> compareUpdateTopCategoryInfo(TopCategoryUpdateRequestDTO topCategoryUpdateRequestDTO) {
        List<TopCategoryInfoVO> topCategoryInfoVOs = new ArrayList<>();

        TopCategorySelectRequestDTO topCategorySelectRequestDTO = new TopCategorySelectRequestDTO();
        topCategorySelectRequestDTO.setPdCt1No(topCategoryUpdateRequestDTO.getPdCt1No());

        topCategoryInfoVOs.add(selectTopCategoryInfo(topCategorySelectRequestDTO));
        topCategoryInfoVOs.add(updateAndReturnTopCategoryInfo(topCategoryUpdateRequestDTO));

        return topCategoryInfoVOs;
    }

    @Override
    public List<BottomCategoryInfoVO> selectBottomCategoryInfoList() {
        return categoryDAO.selectBottomCategoryInfoList();
    }

    @Override
    public List<BottomCategoryInfoVO> selectAllCategoryInfoList() {
        return categoryDAO.selectAllCategoryInfoList();
    }
}
