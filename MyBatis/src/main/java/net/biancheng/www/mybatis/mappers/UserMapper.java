package net.biancheng.www.mybatis.mappers;

import net.biancheng.www.mybatis.bean.User;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

@Mapper
public interface UserMapper {
    //通过用户名密码查询用户数据
    @Select("SELECT * FROM user WHERE user_name=#{item.userName} AND password=#{item.password}")
    @Results(id = "selectUserMaps", value = {
        @Result(column = "id", property = "id", jdbcType = JdbcType.INTEGER),
        @Result(column = "user_id", property = "userId", jdbcType = JdbcType.VARCHAR),
        @Result(column = "user_name",property = "userName",jdbcType = JdbcType.VARCHAR),
        @Result(column = "password", property = "password",jdbcType = JdbcType.VARCHAR),
        @Result(column = "email", property = "email", jdbcType = JdbcType.VARCHAR),
    })
    public User getByUserNameAndPassword(@Param("item") User user);

    @Select("SELECT * FROM user WHERE user_name=#{userName} AND password=#{password}")
    @ResultMap("selectUserMaps")
    public User getByUserNameAndPassword(@Param("userName") String userName,@Param("password") String password);

    @Delete("DELETE FROM user WHERE user_name=#{userName}")
    public Integer deleteByUserName(@Param("userName") String userName );

    @Delete("DELETE FROM user WHERE user_name=#{item.userName}")
    public Integer deleteByUserName(@Param("item") User user);
}
