package com.dev.market.server.model.dto;

import com.dev.market.server.util.enums.ServerStateEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "ServerStateUpdateRequestDTO", description = "서버 상태를 업데이트하는 DTO")
@Data
public class ServerStateUpdateRequestDTO {
    @ApiModelProperty(value = "서버 상태 번호", example = "1", required = true)
    Long serverStateNo;

    @ApiModelProperty(value = "서버 상태 제목", example = "테스트", required = true)
    String serverStateTitle;

    @ApiModelProperty(value = "서버 상태 내용", example = "테스트", required = true)
    String serverStateContent;

    @ApiModelProperty(value = "서버 상태", example = "OPEN", required = true)
    ServerStateEnum serverStateEnum;
}
