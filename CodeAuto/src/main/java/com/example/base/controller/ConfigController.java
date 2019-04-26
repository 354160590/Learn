package com.example.base.controller;

import com.example.base.entity.Config;
import com.example.base.service.ConfigService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Project demo
 * @ClassName ConfigController
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/26
 * Version 1.0
 **/
@RestController
@RequestMapping("/configController/*")
@Api(value = "ConfigController")
public class ConfigController {
    @Autowired
ConfigService configService;

    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return int
     **/
	@ApiOperation("根据主键删除Config实体")
    @DeleteMapping("deleteByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
    public int deleteByPrimaryKey(Integer id){
        return this.configService.deleteByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
    @ApiOperation("插入Config实体")
    @PutMapping("insert")
    public int insert(@RequestBody @ApiParam(name="record",value="Config实体") Config record){
        return this.configService.insert(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
	@ApiOperation("非空插入Config实体")
    @PutMapping("insertSelective")
    public int insertSelective(@RequestBody @ApiParam(name="record",value="Config实体")Config record){
        return this.configService.insertSelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return com.example.base.entity.Config
     **/
	@ApiOperation("根据主键查询Config实体")
    @GetMapping("selectByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
    public Config selectByPrimaryKey(Integer id){
        return this.configService.selectByPrimaryKey(id);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
	@ApiOperation("修改非空Config实体")
    @PutMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody @ApiParam(name="record",value="Config实体")Config record){
        return this.configService.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
	@ApiOperation("修改Config实体")
    @PutMapping("updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody @ApiParam(name="record",value="Config实体")Config record){
        return this.configService.updateByPrimaryKey(record);
    }
}
