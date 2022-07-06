package com.dev.market.category.model.dto;

import com.dev.market.category.util.enums.UseYNEnum;
import lombok.Data;

@Data
public class TopCategoryUpdateRequestDTO {
    Integer pdCt1No;
    String pdCt1Name;
    UseYNEnum useYNEnum;
}
