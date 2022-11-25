package com.serverlist.authserver.mapper;

import static com.serverlist.authserver.mapper.ServerNoticeDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import com.serverlist.authserver.entity.ServerNotice;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

@Mapper
public interface ServerNoticeMapper {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    BasicColumn[] selectList = BasicColumn.columnList(id, serverId, notice, startTime, endTime, isEnd);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<ServerNotice> insertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<ServerNotice> multipleInsertStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ServerNoticeResult")
    Optional<ServerNotice> selectOne(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("ServerNoticeResult")
    List<ServerNotice> selectManyWithRowbounds(SelectStatementProvider selectStatement, RowBounds rowBounds);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Function<SelectStatementProvider, List<ServerNotice>> selectManyWithRowbounds(RowBounds rowBounds) {
        return selectStatement -> selectManyWithRowbounds(selectStatement, rowBounds);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="ServerNoticeResult", value = {
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.INTEGER),
        @Result(column="notice", property="notice", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_time", property="startTime", jdbcType=JdbcType.BIGINT),
        @Result(column="end_time", property="endTime", jdbcType=JdbcType.BIGINT),
        @Result(column="is_end", property="isEnd", jdbcType=JdbcType.TINYINT)
    })
    List<ServerNotice> selectMany(SelectStatementProvider selectStatement);

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
    List<ServerNotice> selectManyJoinList(SelectStatementProvider selectStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int deleteByPrimaryKey(Integer id_) {
        return delete(c -> 
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insert(ServerNotice record) {
        return MyBatis3Utils.insert(this::insert, record, serverNotice, c ->
            c.map(id).toProperty("id")
            .map(serverId).toProperty("serverId")
            .map(notice).toProperty("notice")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(isEnd).toProperty("isEnd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertMultiple(Collection<ServerNotice> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, serverNotice, c ->
            c.map(id).toProperty("id")
            .map(serverId).toProperty("serverId")
            .map(notice).toProperty("notice")
            .map(startTime).toProperty("startTime")
            .map(endTime).toProperty("endTime")
            .map(isEnd).toProperty("isEnd")
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int insertSelective(ServerNotice record) {
        return MyBatis3Utils.insert(this::insert, record, serverNotice, c ->
            c.map(id).toPropertyWhenPresent("id", record::getId)
            .map(serverId).toPropertyWhenPresent("serverId", record::getServerId)
            .map(notice).toPropertyWhenPresent("notice", record::getNotice)
            .map(startTime).toPropertyWhenPresent("startTime", record::getStartTime)
            .map(endTime).toPropertyWhenPresent("endTime", record::getEndTime)
            .map(isEnd).toPropertyWhenPresent("isEnd", record::getIsEnd)
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ServerNotice> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ServerNotice> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default List<ServerNotice> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default Optional<ServerNotice> selectByPrimaryKey(Integer id_) {
        return selectOne(c ->
            c.where(id, isEqualTo(id_))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, serverNotice, completer);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateAllColumns(ServerNotice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalTo(record::getId)
                .set(serverId).equalTo(record::getServerId)
                .set(notice).equalTo(record::getNotice)
                .set(startTime).equalTo(record::getStartTime)
                .set(endTime).equalTo(record::getEndTime)
                .set(isEnd).equalTo(record::getIsEnd);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(ServerNotice record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(id).equalToWhenPresent(record::getId)
                .set(serverId).equalToWhenPresent(record::getServerId)
                .set(notice).equalToWhenPresent(record::getNotice)
                .set(startTime).equalToWhenPresent(record::getStartTime)
                .set(endTime).equalToWhenPresent(record::getEndTime)
                .set(isEnd).equalToWhenPresent(record::getIsEnd);
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKey(ServerNotice record) {
        return update(c ->
            c.set(serverId).equalTo(record::getServerId)
            .set(notice).equalTo(record::getNotice)
            .set(startTime).equalTo(record::getStartTime)
            .set(endTime).equalTo(record::getEndTime)
            .set(isEnd).equalTo(record::getIsEnd)
            .where(id, isEqualTo(record::getId))
        );
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    default int updateByPrimaryKeySelective(ServerNotice record) {
        return update(c ->
            c.set(serverId).equalToWhenPresent(record::getServerId)
            .set(notice).equalToWhenPresent(record::getNotice)
            .set(startTime).equalToWhenPresent(record::getStartTime)
            .set(endTime).equalToWhenPresent(record::getEndTime)
            .set(isEnd).equalToWhenPresent(record::getIsEnd)
            .where(id, isEqualTo(record::getId))
        );
    }
}