/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2022-05-04T13:19:58.0510169+08:00
 */
package org.alanfeng.entity

import java.util.Date

data class SysUser(
    var id: Long? = null,
    var email: String? = null,
    var nickname: String? = null,
    var password: String? = null,
    var role: String? = null,
    var state: String? = null,
    var sex: String? = null,
    var source: String? = null,
    var avatar: String? = null,
    var signature: String? = null,
    var lastLoginTime: Date? = null,
    var isDelete: Byte? = null,
    var createAt: Date? = null,
    var updateAt: Date? = null,
    var phoneNumber: String? = null,
    var ext: ByteArray? = null
)