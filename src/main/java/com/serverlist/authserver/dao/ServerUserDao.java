package com.serverlist.authserver.dao;

import com.serverlist.authserver.entity.ServerUser;
import static com.serverlist.authserver.mapper.ServerUserDynamicSqlSupport.*;
import com.serverlist.authserver.mapper.ServerUserMapper;
import com.serverlist.authserver.mapper.ServerUserMasterMapper;
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
import java.util.Optional;

@Repository
public class ServerUserDao {

    @Autowired
    private ServerUserMapper ServerUserMapper; //从库map

    @Autowired
    private ServerUserMasterMapper ServerUserMasterMapper; //主库map

    //从库获取唯一数据  selectOne若是多数据会报错
    public ServerUser getOneDataByParam(Map<String,Object> param, BasicColumn...selectList){
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder  = SqlBuilder.select(selectList)
//                .from(SqlTable.of("server_user"))//直接字符串形式
                .from(serverUser)
                .where();
        if(param.containsKey("user_id")){
            builder.and(userId,SqlBuilder.isEqualTo((Integer)param.get("user_id")));
        }
        SelectStatementProvider selectStatement = builder.orderBy(id.descending())
                .build()
                .render(RenderingStrategies.MYBATIS3);
        Optional<ServerUser> optionUser = ServerUserMapper.selectOne(selectStatement);
        if(optionUser.isPresent()){
//            ServerUser slaveUser =  optionUser.get();
            return optionUser.get();
        }
        return null;
    }

    //主库获取多个数据
    public List<ServerUser> getListDataByParam(Map<String,Object> param, BasicColumn...selectList){
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder  = SqlBuilder.select(selectList)
                .from(serverUser)
                .where();
        if(param.containsKey("user_id")){
            builder.and(userId,SqlBuilder.isEqualTo((Integer)param.get("user_id")));
        }
        SelectStatementProvider selectStatement = builder.orderBy(id.descending())
                .build()
                .render(RenderingStrategies.MYBATIS3);
        List<ServerUser> resUser = ServerUserMasterMapper.selectMany(selectStatement);

        return resUser;
    }
}
