package org.alanfeng.rep

import org.alanfeng.User
import org.alanfeng.mapper.SysUserMapper
import org.alanfeng.mapper.selectByPrimaryKey
import org.springframework.stereotype.Repository

@Repository
class UserRep {
    lateinit var mapper: SysUserMapper

    fun getById(id: Long) = mapper.selectByPrimaryKey(id)
    fun getSummaryById(id: Long) = mapper.selectByPrimaryKey(id)?.let {
        User(it.id!!,it.nickname!!,it.avatar!!)
    }
}