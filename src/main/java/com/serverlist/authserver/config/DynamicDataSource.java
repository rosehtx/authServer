package com.serverlist.authserver.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

//动态数据源实现
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDataSource();
    }
}
