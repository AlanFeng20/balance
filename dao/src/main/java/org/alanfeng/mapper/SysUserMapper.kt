/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-05-04T13:19:58.051964+08:00
 */
package org.alanfeng.mapper

import org.alanfeng.entity.SysUser
import org.alanfeng.mapper.SysUserDynamicSqlSupport.avatar
import org.alanfeng.mapper.SysUserDynamicSqlSupport.createAt
import org.alanfeng.mapper.SysUserDynamicSqlSupport.email
import org.alanfeng.mapper.SysUserDynamicSqlSupport.ext
import org.alanfeng.mapper.SysUserDynamicSqlSupport.id
import org.alanfeng.mapper.SysUserDynamicSqlSupport.isDelete
import org.alanfeng.mapper.SysUserDynamicSqlSupport.lastLoginTime
import org.alanfeng.mapper.SysUserDynamicSqlSupport.nickname
import org.alanfeng.mapper.SysUserDynamicSqlSupport.password
import org.alanfeng.mapper.SysUserDynamicSqlSupport.phoneNumber
import org.alanfeng.mapper.SysUserDynamicSqlSupport.role
import org.alanfeng.mapper.SysUserDynamicSqlSupport.sex
import org.alanfeng.mapper.SysUserDynamicSqlSupport.signature
import org.alanfeng.mapper.SysUserDynamicSqlSupport.source
import org.alanfeng.mapper.SysUserDynamicSqlSupport.state
import org.alanfeng.mapper.SysUserDynamicSqlSupport.sysUser
import org.alanfeng.mapper.SysUserDynamicSqlSupport.updateAt
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import org.mybatis.dynamic.sql.util.kotlin.CountCompleter
import org.mybatis.dynamic.sql.util.kotlin.DeleteCompleter
import org.mybatis.dynamic.sql.util.kotlin.KotlinUpdateBuilder
import org.mybatis.dynamic.sql.util.kotlin.SelectCompleter
import org.mybatis.dynamic.sql.util.kotlin.UpdateCompleter
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.countFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.deleteFrom
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insert
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.insertMultiple
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectDistinct
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectList
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.selectOne
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.update
import org.mybatis.dynamic.sql.util.mybatis3.CommonCountMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonDeleteMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonInsertMapper
import org.mybatis.dynamic.sql.util.mybatis3.CommonUpdateMapper

@Mapper
interface SysUserMapper : CommonCountMapper, CommonDeleteMapper, CommonInsertMapper<SysUser>, CommonUpdateMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="SysUserResult", value = [
        Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        Result(column="nickname", property="nickname", jdbcType=JdbcType.VARCHAR),
        Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        Result(column="role", property="role", jdbcType=JdbcType.VARCHAR),
        Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        Result(column="sex", property="sex", jdbcType=JdbcType.VARCHAR),
        Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        Result(column="avatar", property="avatar", jdbcType=JdbcType.VARCHAR),
        Result(column="signature", property="signature", jdbcType=JdbcType.VARCHAR),
        Result(column="last_login_time", property="lastLoginTime", jdbcType=JdbcType.TIMESTAMP),
        Result(column="is_delete", property="isDelete", jdbcType=JdbcType.TINYINT),
        Result(column="create_at", property="createAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="update_at", property="updateAt", jdbcType=JdbcType.TIMESTAMP),
        Result(column="phone_number", property="phoneNumber", jdbcType=JdbcType.VARCHAR),
        Result(column="ext", property="ext", jdbcType=JdbcType.LONGVARBINARY)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<SysUser>

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("SysUserResult")
    fun selectOne(selectStatement: SelectStatementProvider): SysUser?
}

fun SysUserMapper.count(completer: CountCompleter) =
    countFrom(this::count, sysUser, completer)

fun SysUserMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, sysUser, completer)

fun SysUserMapper.deleteByPrimaryKey(id_: Long) =
    delete {
        where { id isEqualTo id_ }
    }

fun SysUserMapper.insert(row: SysUser) =
    insert(this::insert, row, sysUser) {
        map(id) toProperty "id"
        map(email) toProperty "email"
        map(nickname) toProperty "nickname"
        map(password) toProperty "password"
        map(role) toProperty "role"
        map(state) toProperty "state"
        map(sex) toProperty "sex"
        map(source) toProperty "source"
        map(avatar) toProperty "avatar"
        map(signature) toProperty "signature"
        map(lastLoginTime) toProperty "lastLoginTime"
        map(isDelete) toProperty "isDelete"
        map(createAt) toProperty "createAt"
        map(updateAt) toProperty "updateAt"
        map(phoneNumber) toProperty "phoneNumber"
        map(ext) toProperty "ext"
    }

fun SysUserMapper.insertMultiple(records: Collection<SysUser>) =
    insertMultiple(this::insertMultiple, records, sysUser) {
        map(id) toProperty "id"
        map(email) toProperty "email"
        map(nickname) toProperty "nickname"
        map(password) toProperty "password"
        map(role) toProperty "role"
        map(state) toProperty "state"
        map(sex) toProperty "sex"
        map(source) toProperty "source"
        map(avatar) toProperty "avatar"
        map(signature) toProperty "signature"
        map(lastLoginTime) toProperty "lastLoginTime"
        map(isDelete) toProperty "isDelete"
        map(createAt) toProperty "createAt"
        map(updateAt) toProperty "updateAt"
        map(phoneNumber) toProperty "phoneNumber"
        map(ext) toProperty "ext"
    }

fun SysUserMapper.insertMultiple(vararg records: SysUser) =
    insertMultiple(records.toList())

fun SysUserMapper.insertSelective(row: SysUser) =
    insert(this::insert, row, sysUser) {
        map(id).toPropertyWhenPresent("id", row::id)
        map(email).toPropertyWhenPresent("email", row::email)
        map(nickname).toPropertyWhenPresent("nickname", row::nickname)
        map(password).toPropertyWhenPresent("password", row::password)
        map(role).toPropertyWhenPresent("role", row::role)
        map(state).toPropertyWhenPresent("state", row::state)
        map(sex).toPropertyWhenPresent("sex", row::sex)
        map(source).toPropertyWhenPresent("source", row::source)
        map(avatar).toPropertyWhenPresent("avatar", row::avatar)
        map(signature).toPropertyWhenPresent("signature", row::signature)
        map(lastLoginTime).toPropertyWhenPresent("lastLoginTime", row::lastLoginTime)
        map(isDelete).toPropertyWhenPresent("isDelete", row::isDelete)
        map(createAt).toPropertyWhenPresent("createAt", row::createAt)
        map(updateAt).toPropertyWhenPresent("updateAt", row::updateAt)
        map(phoneNumber).toPropertyWhenPresent("phoneNumber", row::phoneNumber)
        map(ext).toPropertyWhenPresent("ext", row::ext)
    }

private val columnList = listOf(id, email, nickname, password, role, state, sex, source, avatar, signature, lastLoginTime, isDelete, createAt, updateAt, phoneNumber, ext)

fun SysUserMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, sysUser, completer)

fun SysUserMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, sysUser, completer)

fun SysUserMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, sysUser, completer)

fun SysUserMapper.selectByPrimaryKey(id_: Long) =
    selectOne {
        where { id isEqualTo id_ }
    }

fun SysUserMapper.update(completer: UpdateCompleter) =
    update(this::update, sysUser, completer)

fun KotlinUpdateBuilder.updateAllColumns(row: SysUser) =
    apply {
        set(id) equalToOrNull row::id
        set(email) equalToOrNull row::email
        set(nickname) equalToOrNull row::nickname
        set(password) equalToOrNull row::password
        set(role) equalToOrNull row::role
        set(state) equalToOrNull row::state
        set(sex) equalToOrNull row::sex
        set(source) equalToOrNull row::source
        set(avatar) equalToOrNull row::avatar
        set(signature) equalToOrNull row::signature
        set(lastLoginTime) equalToOrNull row::lastLoginTime
        set(isDelete) equalToOrNull row::isDelete
        set(createAt) equalToOrNull row::createAt
        set(updateAt) equalToOrNull row::updateAt
        set(phoneNumber) equalToOrNull row::phoneNumber
        set(ext) equalToOrNull row::ext
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(row: SysUser) =
    apply {
        set(id) equalToWhenPresent row::id
        set(email) equalToWhenPresent row::email
        set(nickname) equalToWhenPresent row::nickname
        set(password) equalToWhenPresent row::password
        set(role) equalToWhenPresent row::role
        set(state) equalToWhenPresent row::state
        set(sex) equalToWhenPresent row::sex
        set(source) equalToWhenPresent row::source
        set(avatar) equalToWhenPresent row::avatar
        set(signature) equalToWhenPresent row::signature
        set(lastLoginTime) equalToWhenPresent row::lastLoginTime
        set(isDelete) equalToWhenPresent row::isDelete
        set(createAt) equalToWhenPresent row::createAt
        set(updateAt) equalToWhenPresent row::updateAt
        set(phoneNumber) equalToWhenPresent row::phoneNumber
        set(ext) equalToWhenPresent row::ext
    }

fun SysUserMapper.updateByPrimaryKey(row: SysUser) =
    update {
        set(email) equalToOrNull row::email
        set(nickname) equalToOrNull row::nickname
        set(password) equalToOrNull row::password
        set(role) equalToOrNull row::role
        set(state) equalToOrNull row::state
        set(sex) equalToOrNull row::sex
        set(source) equalToOrNull row::source
        set(avatar) equalToOrNull row::avatar
        set(signature) equalToOrNull row::signature
        set(lastLoginTime) equalToOrNull row::lastLoginTime
        set(isDelete) equalToOrNull row::isDelete
        set(createAt) equalToOrNull row::createAt
        set(updateAt) equalToOrNull row::updateAt
        set(phoneNumber) equalToOrNull row::phoneNumber
        set(ext) equalToOrNull row::ext
        where { id isEqualTo row.id!! }
    }

fun SysUserMapper.updateByPrimaryKeySelective(row: SysUser) =
    update {
        set(email) equalToWhenPresent row::email
        set(nickname) equalToWhenPresent row::nickname
        set(password) equalToWhenPresent row::password
        set(role) equalToWhenPresent row::role
        set(state) equalToWhenPresent row::state
        set(sex) equalToWhenPresent row::sex
        set(source) equalToWhenPresent row::source
        set(avatar) equalToWhenPresent row::avatar
        set(signature) equalToWhenPresent row::signature
        set(lastLoginTime) equalToWhenPresent row::lastLoginTime
        set(isDelete) equalToWhenPresent row::isDelete
        set(createAt) equalToWhenPresent row::createAt
        set(updateAt) equalToWhenPresent row::updateAt
        set(phoneNumber) equalToWhenPresent row::phoneNumber
        set(ext) equalToWhenPresent row::ext
        where { id isEqualTo row.id!! }
    }