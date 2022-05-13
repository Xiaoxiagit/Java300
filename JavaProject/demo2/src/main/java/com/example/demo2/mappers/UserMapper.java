package com.example.demo2.mappers;


import com.example.demo2.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

@Mapper
public interface UserMapper {
    //通过用户名密码查询用户数据
    @Select("SELECT id,user_id,user_name,password,email FROM testuser WHERE user_name=#{item.userName} AND password=#{item.password}")
    @Results(id = "selectUserMaps" , value ={
        @Result(column = "id", property = "id", jdbcType = JdbcType.BIGINT),
        @Result(column = "user_id",property = "userId",jdbcType = JdbcType.BIGINT),
        @Result(column = "user_name",property="userName",jdbcType = JdbcType.VARCHAR),
        @Result(column = "password",property = "password",jdbcType = JdbcType.VARCHAR),
        @Result(column = "email",property = "email",jdbcType = JdbcType.VARCHAR),
    })
    public User getByUser(@Param("item") User User);
    @Select("SELECT id,user_id,user_name,password,email FROM testuser WHERE user_name=#{userName} AND password=#{password}")
    @ResultMap("selectUserMaps")
    public User getByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    @Delete("DELETE FROM testuser WHERE user_name=#{userName}")
    public  Integer deleteByUserName(@Param("userName") String userName);

    @Delete("DELETE FROM testuser WHERE user_name=#{item.userName}")
    public Integer deleteByUser(@Param("item") User user);

    @Select("SELECT id, user_id, user_name,password, email FROM testuser")
    @ResultMap("selectUserMaps")
    public List<User> selectAllUsers();


}
