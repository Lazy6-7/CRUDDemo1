package com.zy.mapper;

import com.zy.bean.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @Description:
 * @Title: UserMapper
 * @Package com.zy.mapper
 * @Author: xiaozhang
 * @Copyright 版权归xiaozhang所有
 * @CreateTime: 2022/10/27 14:12
 */
public interface UserMapper {
    /**
     * 查询所有信息
     * @return
     */
    List<User> selectAll();

    /**
     * 添加信息
     * @return
     */
    void addUser(User user);

    /**
     * 删除信息
     * @param id
     */
    void deleteById(int id);

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User selectById(int id);

    /**
     * 修改信息
     * @param user
     */
    void update(User user);
}
