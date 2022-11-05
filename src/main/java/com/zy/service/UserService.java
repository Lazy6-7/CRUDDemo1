package com.zy.service;

import com.zy.bean.User;
import com.zy.mapper.UserMapper;
import com.zy.util.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Description:
 * @Title: UserService
 * @Package com.zy.service
 * @Author: xiaozhang
 * @Copyright 版权归xiaozhang所有
 * @CreateTime: 2022/10/27 14:12
 */
public class UserService {
    SqlSessionFactory sqlSessionFactory = SqlSessionFactoryUtils.getSqlSessionFactory();

    /**
     * 查询所有信息
     * @return
     */
    public List<User> selectAll(){
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        List<User> users = mapper.selectAll();
        // 释放资源
        sqlSession.close();
        return users;
    }

    /**
     * 添加信息
     * @param user
     * @return
     */
    public void addUser(User user){
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        mapper.addUser(user);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

    /**
     * 删除信息
     */
    public void deleteById(int id){
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        mapper.deleteById(id);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }

    /**
     * 根据id查询
     * @param id
     * @return
     */
    public User selectById(int id){
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        User user = mapper.selectById(id);
        // 释放资源
        sqlSession.close();
        return user;
    }

    /**
     * 修改信息
     */
    public void update(User user){
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        // 执行方法
        mapper.update(user);
        // 提交事务
        sqlSession.commit();
        // 释放资源
        sqlSession.close();
    }
}
