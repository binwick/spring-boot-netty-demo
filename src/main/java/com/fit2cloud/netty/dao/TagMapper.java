package com.fit2cloud.netty.dao;

import com.fit2cloud.netty.model.Tag;
import com.fit2cloud.netty.model.TagExample;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface TagMapper {
    @SelectProvider(type=TagSqlProvider.class, method="countByExample")
    long countByExample(TagExample example);

    @DeleteProvider(type=TagSqlProvider.class, method="deleteByExample")
    int deleteByExample(TagExample example);

    @Delete({
        "delete from tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    @Insert({
        "insert into tag (id, server_id, ",
        "group_id, name, value, ",
        "cluster_id, cluster_role_id, ",
        "server_name, cluster_name, ",
        "cluster_role_name)",
        "values (#{id,jdbcType=BIGINT}, #{serverId,jdbcType=BIGINT}, ",
        "#{groupId,jdbcType=BIGINT}, #{name,jdbcType=VARCHAR}, #{value,jdbcType=VARCHAR}, ",
        "#{clusterId,jdbcType=BIGINT}, #{clusterRoleId,jdbcType=BIGINT}, ",
        "#{serverName,jdbcType=VARCHAR}, #{clusterName,jdbcType=VARCHAR}, ",
        "#{clusterRoleName,jdbcType=VARCHAR})"
    })
    int insert(Tag record);

    @InsertProvider(type=TagSqlProvider.class, method="insertSelective")
    int insertSelective(Tag record);

    @SelectProvider(type=TagSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_id", property="clusterId", jdbcType=JdbcType.BIGINT),
        @Result(column="cluster_role_id", property="clusterRoleId", jdbcType=JdbcType.BIGINT),
        @Result(column="server_name", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_name", property="clusterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_role_name", property="clusterRoleName", jdbcType=JdbcType.VARCHAR)
    })
    List<Tag> selectByExample(TagExample example);

    @Select({
        "select",
        "id, server_id, group_id, name, value, cluster_id, cluster_role_id, server_name, ",
        "cluster_name, cluster_role_name",
        "from tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="server_id", property="serverId", jdbcType=JdbcType.BIGINT),
        @Result(column="group_id", property="groupId", jdbcType=JdbcType.BIGINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_id", property="clusterId", jdbcType=JdbcType.BIGINT),
        @Result(column="cluster_role_id", property="clusterRoleId", jdbcType=JdbcType.BIGINT),
        @Result(column="server_name", property="serverName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_name", property="clusterName", jdbcType=JdbcType.VARCHAR),
        @Result(column="cluster_role_name", property="clusterRoleName", jdbcType=JdbcType.VARCHAR)
    })
    Tag selectByPrimaryKey(Long id);

    @UpdateProvider(type=TagSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagExample example);

    @UpdateProvider(type=TagSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") Tag record, @Param("example") TagExample example);

    @UpdateProvider(type=TagSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Tag record);

    @Update({
        "update tag",
        "set server_id = #{serverId,jdbcType=BIGINT},",
          "group_id = #{groupId,jdbcType=BIGINT},",
          "name = #{name,jdbcType=VARCHAR},",
          "value = #{value,jdbcType=VARCHAR},",
          "cluster_id = #{clusterId,jdbcType=BIGINT},",
          "cluster_role_id = #{clusterRoleId,jdbcType=BIGINT},",
          "server_name = #{serverName,jdbcType=VARCHAR},",
          "cluster_name = #{clusterName,jdbcType=VARCHAR},",
          "cluster_role_name = #{clusterRoleName,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Tag record);
}