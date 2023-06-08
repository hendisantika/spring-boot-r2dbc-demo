package com.hendisantika.springbootr2dbcdemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 11:09
 * To change this template use File | Settings | File Templates.
 */
@Data
@AllArgsConstructor
@Builder
@Table("student")
public class Student {
    @Id
    private Long id;
    private String firstname;
    private String lastname;
    private int age;
}
