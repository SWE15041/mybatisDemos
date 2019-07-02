package com.lyn.mapper;

import com.lyn.domain.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    public int insertUser(User user) throws Exception;

    public void updateUser(User user) throws Exception;

    public int deleteUser(int id) throws Exception;

    public User selectUserById(int id) throws Exception;
    public User selectUserById2(@Param("id") int id,@Param("username") String username) throws Exception;
    public List<User> selectAllUser() throws Exception;

    public void updateUser2(User user) throws Exception;

}
