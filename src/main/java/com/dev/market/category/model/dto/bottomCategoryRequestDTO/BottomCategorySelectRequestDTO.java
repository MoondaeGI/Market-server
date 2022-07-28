package com.dev.market.category.model.dto.bottomCategoryRequestDTO;

import com.dev.market.category.util.enums.UseYNEnum;
import lombok.Data;

@Data
public class BottomCategorySelectRequestDTO {
    Integer pdCt2No;
    String pdCt2Name;
    UseYNEnum useYNEnum;
}
