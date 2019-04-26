package com.example.base.service.impl;

import com.example.base.Mapper.ConfigDao;
import com.example.base.entity.Config;
import com.example.base.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project demo
 * @ClassName ConfigServiceImpl
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/26
 * Version 1.0
 **/
@Service("configService")
public class ConfigServiceImpl implements ConfigService {
    @Autowired
ConfigDao configDao;
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return int
     **/
    @Override
    public int deleteByPrimaryKey(Integer id){
        return this.configDao.deleteByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
    @Override
    public int insert(Config record){
        return this.configDao.insert(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
    @Override
    public int insertSelective(Config record){
        return this.configDao.insertSelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return com.example.base.entity.Config
     **/
    @Override
    public Config selectByPrimaryKey(Integer id){
        return this.configDao.selectByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKeySelective(Config record){
        return this.configDao.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKey(Config record){
        return this.configDao.updateByPrimaryKey(record);
    }
}
