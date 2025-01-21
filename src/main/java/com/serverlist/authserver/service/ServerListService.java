package com.serverlist.authserver.service;

import com.serverlist.authserver.channel.commonEnum;
import com.serverlist.authserver.config.DataSourceContextHolder;
import com.serverlist.authserver.entity.ServerList;
import com.serverlist.authserver.mapper.ServerListMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ServerListService {
    @Autowired
    private ServerListMapper serverListMapper;

    public ServerList getServerListById(Long id) {
        // 切换到主数据源
        DataSourceContextHolder.setDataSource(commonEnum.master.getValue());
        ServerList serverList = serverListMapper.findById(id);
        DataSourceContextHolder.clear();
        return serverList;
    }

    public List<ServerList> findByConditions(Long serverId,int type) {
        // 切换到从数据源
        DataSourceContextHolder.setDataSource(commonEnum.slave.getValue());
        List<ServerList> serverList = serverListMapper.findByConditions(serverId,type);
        DataSourceContextHolder.clear();
        return serverList;
    }

}
