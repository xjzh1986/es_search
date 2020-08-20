package com.es.vo;


import lombok.Data;

/**
 * @Description:
 * @Param:
 * @Return:
 * @Author: qjc
 * @Date: 2019/10/18
 */
@Data   //IDEA需要安装lombok：https://www.cnblogs.com/java-spring/p/9797560.html
public class SysUser {

    private String name;

    private int age;

    private Double money;

    private String address;

    private String birthday;
}
