package com.serverlist.authserver.dao;

import com.serverlist.authserver.entity.ServerUser;
import static com.serverlist.authserver.mapper.ServerUserDynamicSqlSupport.*;
import com.serverlist.authserver.mapper.ServerUserMapper;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.SqlBuilder;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.select.QueryExpressionDSL;
import org.mybatis.dynamic.sql.select.SelectModel;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Map;
import java.util.Optional;

@Repository
public class ServerUserDao {

    @Autowired
    private ServerUserMapper ServerUserMapper;

    public Optional<ServerUser> getOneDataByParam(Map<String,Object> param, BasicColumn...selectList){
        QueryExpressionDSL<SelectModel>.QueryExpressionWhereBuilder builder  = SqlBuilder.select(selectList)
//        SelectStatementProvider select = SqlBuilder.select(selectList)
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
            ServerUser masterUser =  optionUser.get();
            System.out.print("===================");
            System.out.println(masterUser);
            System.out.print("\n");
        }
        return optionUser;
    }
}
