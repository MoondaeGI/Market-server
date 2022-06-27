package com.dev.market.server.model.dao;

import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ServerDAO {
    List<ServerStateInfoVo> selectServerStateInfoList();
    ServerStateInfoVo selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO);
    Integer insertServerStateInfo(ServerStateInsertRequestDTO serverStateInsertRequestDTO);
    Integer updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO);
}
