package com.dev.market.server.model.dto;

import com.dev.market.server.util.enums.ServerStateEnum;

public class ServerStateUpdateRequestDTO {
    Long serverStateNo;
    String serverStateTitle;
    String serverStateContent;
    ServerStateEnum serverStateEnum;
}
