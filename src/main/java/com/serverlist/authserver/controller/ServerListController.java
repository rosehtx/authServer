package com.serverlist.authserver.controller;

import com.serverlist.authserver.entity.ServerList;
import com.serverlist.authserver.mapper.ServerListMapper;
import com.serverlist.authserver.service.ServerListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/serverList")
public class ServerListController {
    @Autowired
    private ServerListService serverListService;

    @GetMapping("/getServerListById")
    public ServerList getServerListById(@RequestParam("serverId") Long serverId, @RequestParam("id") Long id) {
        ServerList s;
        s = serverListService.getServerListById(id);
        System.out.println(s);
        return s;
    }

    @GetMapping("/getServerListByCondition")
    public List<ServerList> getServerListByCondition(
            @RequestParam(value = "serverId",defaultValue = "0") Long serverId,
            @RequestParam(value = "type",defaultValue = "0") int type
    ) {
        List<ServerList> serverLists;
        serverLists = serverListService.findByConditions(serverId,type);
        System.out.println(serverLists);
        return serverLists;
    }
}
