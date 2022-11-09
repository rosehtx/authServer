package com.serverlist.authserver.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ServerCostDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ServerCost serverCost = new ServerCost();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> costName = serverCost.costName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Float> costValue = serverCost.costValue;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Date> lastUpdate = serverCost.lastUpdate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> comment = serverCost.comment;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ServerCost extends SqlTable {
        public final SqlColumn<String> costName = column("cost_name", JDBCType.VARCHAR);

        public final SqlColumn<Float> costValue = column("cost_value", JDBCType.REAL);

        public final SqlColumn<Date> lastUpdate = column("last_update", JDBCType.TIMESTAMP);

        public final SqlColumn<String> comment = column("`comment`", JDBCType.VARCHAR);

        public ServerCost() {
            super("server_cost");
        }
    }
}