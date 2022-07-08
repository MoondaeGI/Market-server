package com.dev.market.category.model.vo;

import com.dev.market.category.util.enums.UseYNEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BottomCategoryInfoVO {
    Integer pdCt2No;
    Integer pdCt1No;
    String pdCt1Name;
    String pdCt2Name;
    UseYNEnum useYNEnum;
    String regDt;
}
