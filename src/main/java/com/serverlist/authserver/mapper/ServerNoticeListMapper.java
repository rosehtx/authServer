package com.serverlist.authserver.mapper;

import java.util.List;
import javax.annotation.Generated;

import com.serverlist.authserver.entity.ServerNoticeList;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;


@Mapper
public interface ServerNoticeListMapper {

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type = SqlProviderAdapter.class, method = "select")
    @Results(id = "ServerNoticeResult2", value = {
            @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
            @Result(column="server_id", property="serverId", jdbcType=JdbcType.INTEGER),
            @Result(column="notice", property="notice", jdbcType=JdbcType.VARCHAR),
            @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
            @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
            @Result(column="is_end", property="isEnd", jdbcType=JdbcType.TINYINT),
            @Result(column="server_list_id", property="serverListId", jdbcType=JdbcType.INTEGER),
            @Result(column="ip", property="ip", jdbcType=JdbcType.VARCHAR)
    })
    List<ServerNoticeList> selectManyJoinList(SelectStatementProvider selectStatement);

}