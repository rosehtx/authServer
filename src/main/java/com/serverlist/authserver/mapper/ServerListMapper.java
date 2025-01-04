package com.serverlist.authserver.mapper;

import com.serverlist.authserver.entity.ServerList;
import java.util.List;

import org.apache.ibatis.annotations.*;

@Mapper
public interface ServerListMapper {
    @Select("SELECT * FROM server_list WHERE id = #{id}")
    ServerList findById(Long id);

    @Insert("INSERT INTO server_list (server_id, ip,port,type,status) VALUES (#{serverId}, #{ip}, #{port}, #{type}, #{status})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insert(ServerList serverList);

    @Select("SELECT * FROM server_list")
    List<ServerList> findAll();

    List<ServerList> findByConditions(@Param("serverId") Long serverId, @Param("type") int type);

}