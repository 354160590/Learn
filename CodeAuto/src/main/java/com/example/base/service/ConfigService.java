package  com.example.base.service;


import  com.example.base.entity.Config;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project demo
 * @ClassName ConfigService
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/26
 * Version 1.0
 **/
 public interface ConfigService {
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return int
     **/
     int deleteByPrimaryKey(Integer id);
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
     int insert(Config record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
     int insertSelective(Config record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Config实体
     * @Date 2019/04/26
     * @Param [id]
     * @return com.example.base.entity.Config
     **/
Config selectByPrimaryKey(Integer id);
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKeySelective(Config record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Config实体
     * @Date 2019/04/26
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKey(Config record);
}
