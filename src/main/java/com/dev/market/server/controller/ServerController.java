package com.dev.market.server.controller;


import com.dev.market.server.model.dto.ServerStateInsertRequestDTO;
import com.dev.market.server.model.dto.ServerStateSelectRequestDTO;
import com.dev.market.server.model.dto.ServerStateUpdateRequestDTO;
import com.dev.market.server.model.vo.ServerStateInfoVo;
import com.dev.market.server.service.ServerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = {"Server API"})
@RequestMapping("/server")
public class ServerController {

    @Autowired
    private ServerService serverService;

    @ApiOperation(value = "서버 상태 리스트 조회", notes = "서버 상태에 대한 정보를 리스트로 조회하는 API")
    @GetMapping("/info/list")
    public List<ServerStateInfoVo> selectServerInfoList() {
        return serverService.selectServerStateInfoList();
    }

    @ApiOperation(value = "서버 상태 조회", notes = "서버 상태에 대한 정보를 조회하는 API")
    @GetMapping("/info")
    public ServerStateInfoVo selectServerInfo(
            @ApiParam(name = "serverStateNo", value = "서버 상태 번호", example = "1", required = true)
            @RequestParam("no") Long serverStateNo
    ) {
        ServerStateSelectRequestDTO serverStateSelectRequestDTO = new ServerStateSelectRequestDTO();
        serverStateSelectRequestDTO.setServerStateNo(serverStateNo);

        return serverService.selectServerStateInfo(serverStateSelectRequestDTO);
    }

    @ApiOperation(value = "서버 상태 삽입", notes = "서버 상태를 삽입하고 카운트 하는 API")
    @PostMapping("/info")
    public String displayInsertServerStateInfoCount(
            @ApiParam(name = "ServerStateInsertRequestDTO",
                    value = "서버 상태 삽입 객체 정보", required = true)
            @RequestBody ServerStateInsertRequestDTO serverStateInsertRequestDTO) {
        return serverService.displayInsertServerStateInfoCount(serverStateInsertRequestDTO);
    }

    @ApiOperation(value = "서버 상태 수정", notes = "서버 상태에 대한 정보를 수정하는 API")
    @PutMapping("/info")
    public Boolean updateServerStateInfo(
            @ApiParam(name = "serverStateUpdateRequestDTO",
                    value = "서버 상태 수정 객체 정보", required = true)
            @RequestBody ServerStateUpdateRequestDTO serverStateUpdateRequestDTO) {
        return serverService.updateServerStateInfo(serverStateUpdateRequestDTO);
    }
}
