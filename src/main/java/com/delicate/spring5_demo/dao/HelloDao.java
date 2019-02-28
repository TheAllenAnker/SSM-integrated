package com.delicate.spring5_demo.dao;

import com.delicate.spring5_demo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface HelloDao {
    User findUserById(@Param("id") int id);
}
