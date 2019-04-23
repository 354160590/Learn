package ${basePackage}.service.impl;

import ${basePackage}.Mapper.${upperClassName}Dao;
import ${basePackage}.entity.${upperClassName};
import ${basePackage}.service.${upperClassName}Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project demo
 * @ClassName ${upperClassName}ServiceImpl
 * @Description TODO
 * @Author: ${author}
 * @Date ${date}
 * Version 1.0
 **/
@Service("${lowerClassName}Service")
public class ${upperClassName}ServiceImpl implements ${upperClassName}Service {
    @Autowired
${upperClassName}Dao ${lowerClassName}Dao;
    /**
     * @Author ${author}
     * @Description //TODO 根据主键删除${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return int
     **/
    @Override
    public int deleteByPrimaryKey(Integer id){
        return this.${lowerClassName}Dao.deleteByPrimaryKey(id);
    }
    /**
     * @Author ${author}
     * @Description //TODO 插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @Override
    public int insert(${upperClassName} record){
        return this.${lowerClassName}Dao.insert(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 非空插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @Override
    public int insertSelective(${upperClassName} record){
        return this.${lowerClassName}Dao.insertSelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 根据主键查询${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return com.example.base.entity.${upperClassName}
     **/
    @Override
    public ${upperClassName} selectByPrimaryKey(Integer id){
        return this.${lowerClassName}Dao.selectByPrimaryKey(id);
    }
    /**
     * @Author ${author}
     * @Description //TODO 修改非空${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKeySelective(${upperClassName} record){
        return this.${lowerClassName}Dao.updateByPrimaryKeySelective(record);
    }
    /**
     * @Author ${author}
     * @Description //TODO 修改${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
    @Override
    public int updateByPrimaryKey(${upperClassName} record){
        return this.${lowerClassName}Dao.updateByPrimaryKey(record);
    }
}
