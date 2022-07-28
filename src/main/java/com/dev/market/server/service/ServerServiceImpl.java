package com.dev.market.server.service;

import com.dev.market.server.model.dao.ServerDAO;
import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class ServerServiceImpl implements ServerService{
    @Autowired
    private ServerDAO serverDAO;

    @Override
    public List<ServerStateInfoVo> selectServerStateInfoList() {
        return serverDAO.selectServerStateInfoList();
    }

    @Override
    public Boolean updateServerStateInfo(ServerStateUpdateRequestDTO serverStateUpdateRequestDTO) {
        return serverDAO.updateServerStateInfo(serverStateUpdateRequestDTO) == 1;
    }

    @Override
    public String displayInsertServerStateInfoCount(ServerStateInsertRequestDTO serverStateInsertRequestDTO) {
        Integer count = serverDAO.insertServerStateInfo(serverStateInsertRequestDTO);

        return "추가된 메세지는 " + count + "개입니다.";
    }

    @Override
    public ServerStateInfoVo selectServerStateInfo(ServerStateSelectRequestDTO serverStateSelectRequestDTO) {
        return serverDAO.selectServerStateInfo(serverStateSelectRequestDTO);
    }
}
