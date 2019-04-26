package ${basePackage}.controller;

import ${basePackage}.entity.${upperClassName};
import ${basePackage}.service.${upperClassName}Service;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @Project demo
 * @ClassName ${upperClassName}Controller
 * @Description TODO
 * @Author: ${author}
 * @Date ${date}
 * Version 1.0
 **/
@RestController
@RequestMapping("/${lowerClassName}Controller/*")
@Api(value = "${upperClassName}Controller")
public class ${upperClassName}Controller {
    @Autowired
${upperClassName}Service ${lowerClassName}Service;

    /**
     * @Author ${author}
     * @Description //TODO 根据主键删除${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return int
     **/
	@ApiOperation("根据主键删除${upperClassName}实体")
    @DeleteMapping("deleteByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
    public int deleteByPrimaryKey(Integer id){
        return this.${lowerClassName}Service.deleteByPrimaryKey(id);
    }
    /**
     * @Author ${author}
     * @Description //TODO 插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @ApiOperation("插入${upperClassName}实体")
    @PutMapping("insert")
    public int insert(@RequestBody @ApiParam(name="record",value="${upperClassName}实体") ${upperClassName} record){
        return this.${lowerClassName}Service.insert(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 非空插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
	@ApiOperation("非空插入${upperClassName}实体")
    @PutMapping("insertSelective")
    public int insertSelective(@RequestBody @ApiParam(name="record",value="${upperClassName}实体")${upperClassName} record){
        return this.${lowerClassName}Service.insertSelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 根据主键查询${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return com.example.base.entity.${upperClassName}
     **/
	@ApiOperation("根据主键查询${upperClassName}实体")
    @GetMapping("selectByPrimaryKey")
    @ApiImplicitParam(paramType="query",name = "id", value = "主键ID", required = true, dataType = "Integer")
    public ${upperClassName} selectByPrimaryKey(Integer id){
        return this.${lowerClassName}Service.selectByPrimaryKey(id);
    }
    /**
     * @Author ${author}
     * @Description //TODO 修改非空${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
	@ApiOperation("修改非空${upperClassName}实体")
    @PutMapping("updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(@RequestBody @ApiParam(name="record",value="${upperClassName}实体")${upperClassName} record){
        return this.${lowerClassName}Service.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 修改${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
	@ApiOperation("修改${upperClassName}实体")
    @PutMapping("updateByPrimaryKey")
    public int updateByPrimaryKey(@RequestBody @ApiParam(name="record",value="${upperClassName}实体")${upperClassName} record){
        return this.${lowerClassName}Service.updateByPrimaryKey(record);
    }
}
