package com.serverlist.authserver.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ServerNoticeDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final ServerNotice serverNotice = new ServerNotice();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> id = serverNotice.id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> serverId = serverNotice.serverId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> notice = serverNotice.notice;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> startTime = serverNotice.startTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Long> endTime = serverNotice.endTime;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Byte> isEnd = serverNotice.isEnd;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class ServerNotice extends SqlTable {
        public final SqlColumn<Integer> id = column("id", JDBCType.INTEGER);

        public final SqlColumn<Integer> serverId = column("server_id", JDBCType.INTEGER);

        public final SqlColumn<String> notice = column("notice", JDBCType.VARCHAR);

        public final SqlColumn<Long> startTime = column("start_time", JDBCType.BIGINT);

        public final SqlColumn<Long> endTime = column("end_time", JDBCType.BIGINT);

        public final SqlColumn<Byte> isEnd = column("is_end", JDBCType.TINYINT);

        public ServerNotice() {
            super("server_notice");
        }
    }
}