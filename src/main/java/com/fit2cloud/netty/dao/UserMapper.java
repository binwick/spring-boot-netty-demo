package com.fit2cloud.netty.dao;

import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.model.UserExample;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {
    long countByExample(UserExample example);

    int deleteByExample(UserExample example);

    @Delete({
        "delete from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into user (id, name, ",
        "email, source, access_token, ",
        "status, created, ",
        "admin, company, phone, ",
        "active_code, active_timeout, ",
        "forget_code, forget_timeout, ",
        "last_login, description, ",
        "ldap_id, staff_id, ",
        "last_mode, current_group_id, ",
        "user_type, cost_center_id)",
        "values (#{id,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, ",
        "#{email,jdbcType=VARCHAR}, #{source,jdbcType=VARCHAR}, #{accessToken,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=VARCHAR}, #{created,jdbcType=TIMESTAMP}, ",
        "#{admin,jdbcType=BIT}, #{company,jdbcType=VARCHAR}, #{phone,jdbcType=BIGINT}, ",
        "#{activeCode,jdbcType=VARCHAR}, #{activeTimeout,jdbcType=TIMESTAMP}, ",
        "#{forgetCode,jdbcType=VARCHAR}, #{forgetTimeout,jdbcType=TIMESTAMP}, ",
        "#{lastLogin,jdbcType=TIMESTAMP}, #{description,jdbcType=VARCHAR}, ",
        "#{ldapId,jdbcType=VARCHAR}, #{staffId,jdbcType=VARCHAR}, ",
        "#{lastMode,jdbcType=VARCHAR}, #{currentGroupId,jdbcType=BIGINT}, ",
        "#{userType,jdbcType=INTEGER}, #{costCenterId,jdbcType=BIGINT})"
    })
    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, name, email, source, access_token, status, created, admin, company, phone, ",
        "active_code, active_timeout, forget_code, forget_timeout, last_login, description, ",
        "ldap_id, staff_id, last_mode, current_group_id, user_type, cost_center_id",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.fit2cloud.netty.dao.UserMapper.BaseResultMap")
    User selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    @Update({
        "update user",
        "set name = #{name,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "source = #{source,jdbcType=VARCHAR},",
          "access_token = #{accessToken,jdbcType=VARCHAR},",
          "status = #{status,jdbcType=VARCHAR},",
          "created = #{created,jdbcType=TIMESTAMP},",
          "admin = #{admin,jdbcType=BIT},",
          "company = #{company,jdbcType=VARCHAR},",
          "phone = #{phone,jdbcType=BIGINT},",
          "active_code = #{activeCode,jdbcType=VARCHAR},",
          "active_timeout = #{activeTimeout,jdbcType=TIMESTAMP},",
          "forget_code = #{forgetCode,jdbcType=VARCHAR},",
          "forget_timeout = #{forgetTimeout,jdbcType=TIMESTAMP},",
          "last_login = #{lastLogin,jdbcType=TIMESTAMP},",
          "description = #{description,jdbcType=VARCHAR},",
          "ldap_id = #{ldapId,jdbcType=VARCHAR},",
          "staff_id = #{staffId,jdbcType=VARCHAR},",
          "last_mode = #{lastMode,jdbcType=VARCHAR},",
          "current_group_id = #{currentGroupId,jdbcType=BIGINT},",
          "user_type = #{userType,jdbcType=INTEGER},",
          "cost_center_id = #{costCenterId,jdbcType=BIGINT}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(User record);
}