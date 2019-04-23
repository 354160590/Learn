package  com.example.base.service;


import  com.example.base.entity.Testuser;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Project demo
 * @ClassName TestuserService
 * @Description TODO
 * @Author: Mr.LYF
 * @Date 2019/04/23
 * Version 1.0
 **/
 public interface TestuserService {
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键删除Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return int
     **/
     int deleteByPrimaryKey(Integer id);
    /**
     * @Author Mr.LYF
     * @Description //TODO 插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
     int insert(Testuser record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 非空插入Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
     int insertSelective(Testuser record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 根据主键查询Testuser实体
     * @Date 2019/04/23
     * @Param [id]
     * @return com.example.base.entity.Testuser
     **/
Testuser selectByPrimaryKey(Integer id);
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改非空Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKeySelective(Testuser record);
    /**
     * @Author Mr.LYF
     * @Description //TODO 修改Testuser实体
     * @Date 2019/04/23
     * @Param [record]
     * @return int
     **/
     int updateByPrimaryKey(Testuser record);
}
