package com.ancestors.manage.dao;

import com.ancestors.manage.entity.TestEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @ClassName TestDao
 * @Author Gavin
 * @Date 2021/2/19 8:55
 * @Description 描述
 * @Version 1.0
 */
@Mapper
public interface TestDao {
    TestEntity selectEntityById(Integer id);
}
