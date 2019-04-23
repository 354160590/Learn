package  ${basePackage}.service;


import  ${basePackage}.entity.${upperClassName};
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project demo
 * @ClassName ${upperClassName}Service
 * @Description TODO
 * @Author: ${author}
 * @Date ${date}
 * Version 1.0
 **/
 public interface ${upperClassName}Service {
    /**
     * @Author ${author}
     * @Description //TODO 根据主键删除${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return int
     **/
     int deleteByPrimaryKey(Integer id);
    /**
     * @Author ${author}
     * @Description //TODO 插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
     int insert(${upperClassName} record);
    /**
     * @Author ${author}
     * @Description //TODO 非空插入${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
     int insertSelective(${upperClassName} record);
    /**
     * @Author ${author}
     * @Description //TODO 根据主键查询${upperClassName}实体
     * @Date ${date}
     * @Param [id]
     * @return com.example.base.entity.${upperClassName}
     **/
${upperClassName} selectByPrimaryKey(Integer id);
    /**
     * @Author ${author}
     * @Description //TODO 修改非空${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKeySelective(${upperClassName} record);
    /**
     * @Author ${author}
     * @Description //TODO 修改${upperClassName}实体
     * @Date ${date}
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKey(${upperClassName} record);
}
