package com.serverlist.authserver.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class ServersDynamicSqlSupport {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final Servers servers = new Servers();

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> serverName = servers.serverName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> host = servers.host;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> db = servers.db;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> username = servers.username;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> password = servers.password;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<Integer> port = servers.port;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> socket = servers.socket;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> wrapper = servers.wrapper;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final SqlColumn<String> owner = servers.owner;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public static final class Servers extends SqlTable {
        public final SqlColumn<String> serverName = column("`Server_name`", JDBCType.CHAR);

        public final SqlColumn<String> host = column("`Host`", JDBCType.CHAR);

        public final SqlColumn<String> db = column("Db", JDBCType.CHAR);

        public final SqlColumn<String> username = column("Username", JDBCType.CHAR);

        public final SqlColumn<String> password = column("`Password`", JDBCType.CHAR);

        public final SqlColumn<Integer> port = column("Port", JDBCType.INTEGER);

        public final SqlColumn<String> socket = column("Socket", JDBCType.CHAR);

        public final SqlColumn<String> wrapper = column("Wrapper", JDBCType.CHAR);

        public final SqlColumn<String> owner = column("`Owner`", JDBCType.CHAR);

        public Servers() {
            super("servers");
        }
    }
}