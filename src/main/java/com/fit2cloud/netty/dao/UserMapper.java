package com.fit2cloud.netty.dao;

import com.fit2cloud.netty.model.User;
import com.fit2cloud.netty.model.UserExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @DeleteProvider(type=UserSqlProvider.class, method="deleteByExample")
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

    @InsertProvider(type=UserSqlProvider.class, method="insertSelective")
    int insertSelective(User record);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_token", property="accessToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin", property="admin", jdbcType=JdbcType.BIT),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.BIGINT),
        @Result(column="active_code", property="activeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="active_timeout", property="activeTimeout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="forget_code", property="forgetCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="forget_timeout", property="forgetTimeout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login", property="lastLogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="ldap_id", property="ldapId", jdbcType=JdbcType.VARCHAR),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_mode", property="lastMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_group_id", property="currentGroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_center_id", property="costCenterId", jdbcType=JdbcType.BIGINT)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "id, name, email, source, access_token, status, created, admin, company, phone, ",
        "active_code, active_timeout, forget_code, forget_timeout, last_login, description, ",
        "ldap_id, staff_id, last_mode, current_group_id, user_type, cost_center_id",
        "from user",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="source", property="source", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_token", property="accessToken", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.VARCHAR),
        @Result(column="created", property="created", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="admin", property="admin", jdbcType=JdbcType.BIT),
        @Result(column="company", property="company", jdbcType=JdbcType.VARCHAR),
        @Result(column="phone", property="phone", jdbcType=JdbcType.BIGINT),
        @Result(column="active_code", property="activeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="active_timeout", property="activeTimeout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="forget_code", property="forgetCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="forget_timeout", property="forgetTimeout", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="last_login", property="lastLogin", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="ldap_id", property="ldapId", jdbcType=JdbcType.VARCHAR),
        @Result(column="staff_id", property="staffId", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_mode", property="lastMode", jdbcType=JdbcType.VARCHAR),
        @Result(column="current_group_id", property="currentGroupId", jdbcType=JdbcType.BIGINT),
        @Result(column="user_type", property="userType", jdbcType=JdbcType.INTEGER),
        @Result(column="cost_center_id", property="costCenterId", jdbcType=JdbcType.BIGINT)
    })
    User selectByPrimaryKey(Long id);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    @UpdateProvider(type=UserSqlProvider.class, method="updateByPrimaryKeySelective")
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