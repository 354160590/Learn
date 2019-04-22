package com.example.controller;

import com.example.entity.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 14:42
 */

@RestController
@RequestMapping("/testBoot")
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * @Author LYF
     * @Description //TODO 根据Id查询人员信息
     * @Date 23:02 2019/4/18
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("getUser/{id}")
    public String GetUser(@PathVariable int id){
        return userService.Sel(id).toString();
    }
    /**
     * @Author LYF
     * @Description //TODO 根据实体修改数据
     * @Date 20:19 2019/4/20
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("updateUser/{id}")
    public String updateUser(@PathVariable int id){
        User user=this.userService.Sel(1);
        user.setPassWord("9090");
         this.userService.updateUser(user);
        return user.toString();
    }
    /**
     * @Author LYF
     * @Description //TODO 根据字段修改数据
     * @Date 20:18 2019/4/20
     * @Param [password, id]
     * @return void
     **/
    @RequestMapping("updateUserByPass/{password}/{id}")
    public void updateUserByPass(@PathVariable String password,@PathVariable int id){
        this.userService.updateUserByPass(password, id);
    }
    /**
     * @Author LYF
     * @Description //TODO 保存多条数据
     * @Date 20:18 2019/4/20
     * @Param []
     * @return void
     **/
    @RequestMapping("/insertUser")
    public void insertUser(){
        User user=new User();
        user.setUserName("王五");
        user.setPassWord("456");
        user.setRealName("ww");
        this.userService.insertUser(user);
    }
    /**
     * @Author LYF
     * @Description //TODO 返回多条数据
     * @Date 20:18 2019/4/20
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/selAll")
    public String selAll(){
        return this.userService.selAll().toString();
    }
    /**
     * @Author LYF
     * @Description //TODO 多表组合查询
     * @Date 20:18 2019/4/20
     * @Param []
     * @return java.lang.String
     **/
    @RequestMapping("/selAll2")
    public String selAll2(){
        return this.userService.selAll2().toString();
    }
    /**
     * @Author LYF
     * @Description //TODO 测试自带事务
     * @Date 20:16 2019/4/20
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("/testTransaction/{id}")
    public String testTransaction(@PathVariable int id){
        /*该方法没有在service层增加@Transactional属性，所以报错后，事务不一致*/
        return this.userService.testTransaction(id);
    }
    /**
     * @Author LYF
     * @Description //TODO 测试声明式事务
     * @Date 20:55 2019/4/20
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("/testTransaction2/{id}")
    public String testTransaction2(@PathVariable int id){
        return this.userService.testTransaction2(id);
    }
    /**
     * @Author LYF
     * @Description //TODO 测试全局性事务
     * @Date 20:55 2019/4/20
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("/testTransaction3/{id}")
    public String testTransaction3(@PathVariable int id){
        return this.userService.saveTransaction(id);
    }
    /**
     * @Author LYF
     * @Description //TODO 测试事务是否只切到service
     * @Date 20:53 2019/4/20
     * @Param [id]
     * @return java.lang.String
     **/
    @RequestMapping("/testTransaction4/{id}")
    public String testTransaction4(@PathVariable int id){
         this.userService.saveTransactionS(id);//执行成功
        return this.userService.saveTransaction(id);//执行失败
        //结果：第一行插入进去了，第二行发生错误后回滚了
    }
}
