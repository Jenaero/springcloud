package com.atguigu.springcloud.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;


@NoArgsConstructor
//@AllArgsConstructor
@Data
@Accessors(chain = true) //链式访问
public class Dept implements Serializable {  //entity --orm--- db_table   必须序列化
    private Long deptno; // 主键
    private String dname; // 部门名称
    private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    public Dept(String dname) {
        super();
        this.dname = dname;
    }

    public static void main(String[] args) {
        Dept dept = new Dept();
        //链式访问
        dept.setDb_source("rd").setDname("db01").setDeptno(1234L);
    }
}
