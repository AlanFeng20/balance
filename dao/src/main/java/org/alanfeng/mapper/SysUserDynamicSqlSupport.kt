/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-05-04T13:19:58.051964+08:00
 */
package org.alanfeng.mapper

import java.sql.JDBCType
import java.util.Date
import org.mybatis.dynamic.sql.AliasableSqlTable
import org.mybatis.dynamic.sql.util.kotlin.elements.column

object SysUserDynamicSqlSupport {
    val sysUser = SysUser()

    val id = sysUser.id

    val email = sysUser.email

    val nickname = sysUser.nickname

    val password = sysUser.password

    val role = sysUser.role

    val state = sysUser.state

    val sex = sysUser.sex

    val source = sysUser.source

    val avatar = sysUser.avatar

    val signature = sysUser.signature

    val lastLoginTime = sysUser.lastLoginTime

    val isDelete = sysUser.isDelete

    val createAt = sysUser.createAt

    val updateAt = sysUser.updateAt

    val phoneNumber = sysUser.phoneNumber

    val ext = sysUser.ext

    class SysUser : AliasableSqlTable<SysUser>("sys_user", ::SysUser) {
        val id = column<Long>(name = "id", jdbcType = JDBCType.BIGINT)

        val email = column<String>(name = "email", jdbcType = JDBCType.VARCHAR)

        val nickname = column<String>(name = "nickname", jdbcType = JDBCType.VARCHAR)

        val password = column<String>(name = "password", jdbcType = JDBCType.VARCHAR)

        val role = column<String>(name = "role", jdbcType = JDBCType.VARCHAR)

        val state = column<String>(name = "state", jdbcType = JDBCType.VARCHAR)

        val sex = column<String>(name = "sex", jdbcType = JDBCType.VARCHAR)

        val source = column<String>(name = "source", jdbcType = JDBCType.VARCHAR)

        val avatar = column<String>(name = "avatar", jdbcType = JDBCType.VARCHAR)

        val signature = column<String>(name = "signature", jdbcType = JDBCType.VARCHAR)

        val lastLoginTime = column<Date>(name = "last_login_time", jdbcType = JDBCType.TIMESTAMP)

        val isDelete = column<Byte>(name = "is_delete", jdbcType = JDBCType.TINYINT)

        val createAt = column<Date>(name = "create_at", jdbcType = JDBCType.TIMESTAMP)

        val updateAt = column<Date>(name = "update_at", jdbcType = JDBCType.TIMESTAMP)

        val phoneNumber = column<String>(name = "phone_number", jdbcType = JDBCType.VARCHAR)

        val ext = column<ByteArray>(name = "ext", jdbcType = JDBCType.LONGVARBINARY)
    }
}