package com.example.service;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/26 0026
 * @Time: 15:23
 */
@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public User Sel(int id){
        return userMapper.Sel(id);
    }
    public void updateUser(User user){
         this.userMapper.updateUser(user);
    }
    public void updateUserByPass(String password,int id){
        this.userMapper.updateUserByPass(password, id);
    }
    public void insertUser(User user){
        this.userMapper.insertUser(user);
    }
    public List selAll(){
        return this.userMapper.selAll();
    }
    public List selAll2(){
        return this.userMapper.selAll2();
    }
    @Transactional
    public String testTransaction2( int id){
        User user=new User();
        user.setUserName("王五");
        user.setPassWord("456");
        user.setRealName("ww");
        this.userMapper.insertUser(user);
//        String aa=null;
//        aa.toString();
        String password="11111";
        this.userMapper.updateUserByPass(password, id);
        return this.userMapper.selAll().toString();
    }
    public String testTransaction( int id){
        User user=new User();
        user.setUserName("王五");
        user.setPassWord("456");
        user.setRealName("ww");
        this.userMapper.insertUser(user);
        String aa=null;
        aa.toString();
        String password="11111";
        this.userMapper.updateUserByPass(password, id);
        return this.userMapper.selAll().toString();
    }
    public String saveTransaction( int id){
        User user=new User();
        user.setUserName("王五");
        user.setPassWord("456");
        user.setRealName("ww");
        this.userMapper.insertUser(user);
        String aa=null;
        aa.toString();
        String password="11111";
        this.userMapper.updateUserByPass(password, id);
        return this.userMapper.selAll().toString();
    }
    public String saveTransactionS( int id){
        User user=new User();
        user.setUserName("王五");
        user.setPassWord("456");
        user.setRealName("ww");
        this.userMapper.insertUser(user);
//        String aa=null;
//        aa.toString();
        String password="11111";
        this.userMapper.updateUserByPass(password, id);
        return this.userMapper.selAll().toString();
    }
}
