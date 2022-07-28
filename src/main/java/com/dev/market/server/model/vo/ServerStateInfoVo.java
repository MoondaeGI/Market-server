package com.dev.market.server.model.vo;

import com.dev.market.server.util.enums.ServerStateEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "ServerStateInfoVO", description = "서버 상태를 나타내는 VO")
@Data
public class ServerStateInfoVo {
    @ApiModelProperty(value = "서버 상태 제목", example = "테스트", required = true)
    String serverStateTitle;

    @ApiModelProperty(value = "서버 상태 내용", example = "테스트", required = true)
    String serverStateContent;

    @ApiModelProperty(value = "서버 상태", example = "OPEN", required = true)
    ServerStateEnum serverStateEnum;

    @ApiModelProperty(value = "등록 날짜", example = "2022-07-28 00:00:00", required = true)
    String regDt;
}
