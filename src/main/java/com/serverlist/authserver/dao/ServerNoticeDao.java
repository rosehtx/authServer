package com.serverlist.authserver.dao;

import com.serverlist.authserver.entity.ServerNotice;
import com.serverlist.authserver.entity.ServerNoticeList;
import com.serverlist.authserver.mapper.*;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

import static com.serverlist.authserver.mapper.ServerNoticeDynamicSqlSupport.*;

@Repository
public class ServerNoticeDao {
    @Autowired
    private ServerNoticeMapper ServerNoticeMapper;

    @Autowired
    private ServerNoticeListMapper ServerNoticeListMapper;

    public List<ServerNoticeList> getListDataByParam(){
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder  = SqlBuilder.select(id,
                        serverId,
                        notice,
//                        SqlBuilder.count(id).as("count"),
                        ServerListDynamicSqlSupport.id.as("server_list_id"),
                        ServerListDynamicSqlSupport.ip)
                .from(serverNotice)
                .leftJoin(ServerListDynamicSqlSupport.serverList)
                .on(serverId, SqlBuilder.equalTo(ServerListDynamicSqlSupport.serverId))
                .where();
        SelectStatementProvider selectStatement = builder.orderBy(id.descending())
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<ServerNoticeList> resNotice = ServerNoticeListMapper.selectManyJoinList(selectStatement);

        return resNotice;
    }
}
