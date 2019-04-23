package ${basePackage}.controller;

import ${basePackage}.entity.${upperClassName};
import ${basePackage}.service.${upperClassName}Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project demo
 * @ClassName ${upperClassName}Controller
 * @Description TODO
 * @Author: ${author}
 * @Date ${date}
 * Version 1.0
 **/
@RestController
@RequestMapping("/${lowerClassName}Controller")
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
    @RequestMapping("/deleteByPrimaryKey")
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
    @RequestMapping("/insert")
    public int insert(${upperClassName} record){
        return this.${lowerClassName}Service.insert(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 非空插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/insertSelective")
    public int insertSelective(${upperClassName} record){
        return this.${lowerClassName}Service.insertSelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 根据主键查询${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return com.example.base.entity.${upperClassName}
     **/
    @RequestMapping("/selectByPrimaryKey")
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
    @RequestMapping("/updateByPrimaryKeySelective")
    public int updateByPrimaryKeySelective(${upperClassName} record){
        return this.${lowerClassName}Service.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 修改${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(${upperClassName} record){
        return this.${lowerClassName}Service.updateByPrimaryKey(record);
    }
}
