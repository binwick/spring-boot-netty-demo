package com.fit2cloud.netty.dao;

import com.fit2cloud.netty.model.Tag;
import com.fit2cloud.netty.model.TagCriteria;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

@Mapper
public interface TagMapper {
    long countByExample(TagCriteria example);

    int deleteByExample(TagCriteria example);

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

    int insertSelective(Tag record);

    List<Tag> selectByExampleWithRowbounds(TagCriteria example, RowBounds rowBounds);

    List<Tag> selectByExample(TagCriteria example);

    @Select({
        "select",
        "id, server_id, group_id, name, value, cluster_id, cluster_role_id, server_name, ",
        "cluster_name, cluster_role_name",
        "from tag",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.fit2cloud.netty.dao.TagMapper.BaseResultMap")
    Tag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Tag record, @Param("example") TagCriteria example);

    int updateByExample(@Param("record") Tag record, @Param("example") TagCriteria example);

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