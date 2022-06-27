package com.dev.market.server.service;

import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVo;

import java.util.List;

public interface ServerService {
    List<ServerStateInfoVo> selectServerStateInfoList();
    ServerStateInfoVo selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO);
    String displayInsertServerStateInfoCount(ServerStateInsertRequestDTO serverStateInsertRequestDTO);
    Boolean updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO);
}
