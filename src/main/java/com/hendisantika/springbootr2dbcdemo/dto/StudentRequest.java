package com.hendisantika.springbootr2dbcdemo.dto;

import lombok.Data;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 11:10
 * To change this template use File | Settings | File Templates.
 */
@Data
public class StudentRequest {
    private String firstname;
    private String lastname;
    private int age;
}
