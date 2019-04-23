package com.example.base.service.impl;

import com.example.base.Mapper.TestuserDao;
import com.example.base.entity.Testuser;
import com.example.base.service.TestuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project demo
 * @ClassName TestuserServiceImpl
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/23
 * Version 1.0
 **/
@Service("testuserService")
public class TestuserServiceImpl implements TestuserService {
    @Autowired
TestuserDao testuserDao;
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return int
     **/
    @Override
    public int deleteByPrimaryKey(Integer id){
        return this.testuserDao.deleteByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @Override
    public int insert(Testuser record){
        return this.testuserDao.insert(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @Override
    public int insertSelective(Testuser record){
        return this.testuserDao.insertSelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return com.example.base.entity.Testuser
     **/
    @Override
    public Testuser selectByPrimaryKey(Integer id){
        return this.testuserDao.selectByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKeySelective(Testuser record){
        return this.testuserDao.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKey(Testuser record){
        return this.testuserDao.updateByPrimaryKey(record);
    }
}
