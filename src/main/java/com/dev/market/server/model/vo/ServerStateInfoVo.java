package com.dev.market.server.model.vo;

import com.dev.market.server.util.enums.ServerStateEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerStateInfoVo {
    String serverStateTitle;
    String serverStateContent;
    ServerStateEnum serverStateEnum;
    String regDt;
}
