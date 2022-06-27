package com.dev.market.server.controller;


import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVo;
import com.dev.market.server.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @GetMapping("/info/list")
    public List<ServerStateInfoVo> selectServerInfoList() {
        return serverService.selectServerStateInfoList();
    }

    @GetMapping("/info")
    public ServerStateInfoVo selectServerInfo(
            @RequestParam("serverStateNo") Long serverStateNo
    ) {
        ServerStateSelectRequestDTO serverStateSelectRequestDTO = new ServerStateSelectRequestDTO();
        serverStateSelectRequestDTO.setServerStateNo(serverStateNo);

        return serverService.selectServerStateInfo(serverStateSelectRequestDTO);
    }

    @PostMapping("/info")
    public String displayInsertServerStateInfoCount(
            @RequestBody ServerStateInsertRequestDTO serverStateInsertRequestDTO) {
        return serverService.displayInsertServerStateInfoCount(serverStateInsertRequestDTO);
    }

    @PutMapping("/info")
    public Boolean updateServerStateInfo(
            @RequestBody ServerStateUpdateRequestDTO serverStateUpdateRequestDTO) {
        return serverService.updateServerStateInfo(serverStateUpdateRequestDTO);
    }
}
