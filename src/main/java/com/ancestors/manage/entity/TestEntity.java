package com.ancestors.manage.entity;

import lombok.Data;

/**
 * @ClassName TestEntity
 * @Author Gavin
 * @Date 2021/2/19 8:56
 * @Description 描述
 * @Version 1.0
 */
@Data
public class TestEntity{
    private static final long serialVersionUID = 546175180873947001L;
    private Integer id;
    private String name;

    @Override
    public String toString() {
        return "TestEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
