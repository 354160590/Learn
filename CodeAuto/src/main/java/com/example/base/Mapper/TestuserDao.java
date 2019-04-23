package com.example.base.Mapper;

import com.example.base.entity.Testuser;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.stereotype.Repository;

/**
 * TestuserDao继承基类
 */
@Repository
public interface TestuserDao extends MyBatisBaseDao<Testuser, Integer> {
}