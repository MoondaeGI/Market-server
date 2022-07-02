package com.dev.market.faq.model.dto;

import com.dev.market.faq.util.enums.OpenYNEnum;
import lombok.Data;

@Data
public class FaqInsertRequestDTO {
    String faqTitle;
    String faqContent;
    OpenYNEnum openYNEnum;
}
