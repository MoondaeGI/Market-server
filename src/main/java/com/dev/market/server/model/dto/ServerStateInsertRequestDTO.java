package com.dev.market.server.model.dto;

import com.dev.market.server.util.enums.ServerStateEnum;
import lombok.Data;

@Data
public class ServerStateInsertRequestDTO {
    String serverStateTitle;
    String serverStateContent;
    ServerStateEnum serverStateEnum;
}
