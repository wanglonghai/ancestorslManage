package com.ancestors.manage.service.Impl;

import com.ancestors.manage.dao.TestDao;
import com.ancestors.manage.entity.TestEntity;
import com.ancestors.manage.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName TestServiceImpl
 * @Author Gavin
 * @Date 2021/2/19 8:54
 * @Description 描述
 * @Version 1.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao testDao;
    @Override
    public TestEntity getEntity(Integer id) {
        return testDao.selectEntityById(id);
    }
}
