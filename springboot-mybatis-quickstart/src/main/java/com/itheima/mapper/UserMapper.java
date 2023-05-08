package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: UserMapper
 * Package: com.itheima.mapper
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/1 15:11
 * @Version: 1.0
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    public List<User> list();
}
