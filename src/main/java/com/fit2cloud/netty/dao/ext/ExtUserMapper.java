package com.fit2cloud.netty.dao.ext;

import com.fit2cloud.netty.model.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ExtUserMapper {
    @Select("select * from user where id = #{id, javaType=long}")
    Optional<User> findSelective(@Param("id") Long id);
}
