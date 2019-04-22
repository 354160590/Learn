package com.example.mapper;

import com.example.entity.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserMapper {

    User Sel(int id);
    void updateUser(User user);
    void updateUserByPass(String password,int id);
    void insertUser(User user);
    List selAll();
    List selAll2();
}
