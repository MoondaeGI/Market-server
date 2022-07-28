package com.dev.market.category.model.dto.bottomCategoryRequestDTO;

import com.dev.market.category.util.enums.UseYNEnum;
import lombok.Data;

@Data
public class BottomCategoryUpdateRequestDTO {
    Integer pdCt2No;
    Integer pdCt1No;
    String pdCt2Name;
    UseYNEnum useYNEnum;
}
