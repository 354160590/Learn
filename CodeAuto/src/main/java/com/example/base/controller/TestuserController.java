package com.example.base.controller;

import com.example.base.entity.Testuser;
import com.example.base.service.TestuserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project demo
 * @ClassName TestuserController
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/23
 * Version 1.0
 **/
@RestController
@RequestMapping("/testuserController")
public class TestuserController {
    @Autowired
TestuserService testuserService;

    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return int
     **/
    @RequestMapping("/deleteByPrimaryKey")
    public int deleteByPrimaryKey(Integer id){
        return this.testuserService.deleteByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/insert")
    public int insert(Testuser record){
        return this.testuserService.insert(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/insertSelective")
    public int insertSelective(Testuser record){
        return this.testuserService.insertSelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return com.example.base.entity.Testuser
     **/
    @RequestMapping("/selectByPrimaryKey")
    public Testuser selectByPrimaryKey(Integer id){
        return this.testuserService.selectByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(Testuser record){
        return this.testuserService.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(Testuser record){
        return this.testuserService.updateByPrimaryKey(record);
    }
}
