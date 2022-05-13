package com.example.databasedemo1.mappers;

import com.example.databasedemo1.entity.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

import java.util.List;

public interface BorrowMapper {
    //通过用户名密码查询用户数据
    @Select("SELECT id, user_id, user_name,password, email FROM testuser WHERE user_name=#{item.userName} AND password=#{item.password}")
    @Results(id = "selectUserMaps", value = {
            @Result(column="id", property="id", jdbcType= JdbcType.BIGINT),
            @Result(column="user_id",property="userId",jdbcType=JdbcType.BIGINT),
            @Result(column="user_name",property="userName",jdbcType=JdbcType.VARCHAR),
            @Result(column="password",property="password",jdbcType=JdbcType.VARCHAR),
            @Result(column="email",property="email",jdbcType=JdbcType.VARCHAR),
    })
    public User getByUser(@Param("item") User user);

    //通过用户名密码查询用户
    @Select("SELECT id,user_id,user_name,password,email FROM testuser WHERE user_name=#{userName} AND password=#{password}")
    @ResultMap("selectUserMaps")
    public User getByUserNameAndPassword(@Param("userName") String userName, @Param("password") String password);

    //通过用户名删除用户
    @Delete("DELETE FROM testuser WHERE user_name=#{userName}")
    public Integer deleteByUserName(@Param("userName") String userName);

    //通过用户名删除用户
    @Delete("DELETE FROM testuser WHERE user_name=#{item.userName}")
    public Integer deleteByUser(@Param("item") User user);

    //查询用户
    @Select("SELECT id, user_id, user_name, password, email FROM testuser")
    @ResultMap("selectUserMaps")
    public List<User> selectAllUsers();

    //增加
    @Insert("INSERT INTO  testuser (id,user_id,user_name,password,email) VALUES (#{item.id} ,#{item.userId} ,#{item.userName},#{item.password},#{item.email})")
    @ResultMap("selectUserMaps")
    public int add(@Param("item") User user);

    //删除
    @Delete("delete from testuser where id = #{id}")
    @ResultMap("selectUserMaps")
    public int delete(@Param("id") int id);

    //修改
    @Update("update testuser SET user_name = #{userName} WHERE id = #{id}")
    @ResultMap("selectUserMaps")
    public int update(@Param("id") int id,@Param("userName") String userName);

    //查询
    @Select("SELECT id,user_id,user_name,password,email FROM testuser WHERE id= #{id}")
    @ResultMap("selectUserMaps")
    public List<User> select(@Param("id") int id);
}
