package com.dev.market.faq.model.dto;

import com.dev.market.faq.util.enums.OpenYNEnum;

public class FaqUpdateRequestDTO {
    Long faqNo;
    String faqTitle;
    String faqContent;
    OpenYNEnum openYNEnum;
}
