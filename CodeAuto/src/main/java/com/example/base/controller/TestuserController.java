package com.example.base.controller;

import com.example.base.entity.Testuser;
import com.example.base.service.TestuserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Project demo
 * @ClassName TestuserController
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/23
 * Version 1.0
 **/
@RestController
@RequestMapping("/testuserController/*")
@Api(value = "TestuserController测试swagger注解的控制器")
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
    @ApiOperation("根据主键删除Testuser实体")
    @DeleteMapping("deleteByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
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
    @ApiOperation("插入Testuser实体")
    @PutMapping("insert")
    public int insert(@RequestBody @ApiParam(name="record",value="Testuser实体")Testuser record){
        return this.testuserService.insert(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @ApiOperation("非空插入Testuser实体")
    @PutMapping("insertSelective")
    public int insertSelective(@RequestBody @ApiParam(name="record",value="Testuser实体")Testuser record){
        return this.testuserService.insertSelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return com.example.base.entity.Testuser
     **/
    @ApiOperation("根据主键查询Testuser实体")
    @GetMapping("selectByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
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
    @ApiOperation("修改非空Testuser实体")
    @PutMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody @ApiParam(name="record",value="Testuser实体")Testuser record){
        return this.testuserService.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
    @ApiOperation("修改Testuser实体")
    @PutMapping("updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody @ApiParam(name="record",value="Testuser实体")Testuser record){
        return this.testuserService.updateByPrimaryKey(record);
    }
}
