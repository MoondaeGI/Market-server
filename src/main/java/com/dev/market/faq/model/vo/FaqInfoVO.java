package com.dev.market.faq.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FaqInfoVO {
    Long faqNo;
    String faqTitle;
    String faqContent;
    String regDt;
}
