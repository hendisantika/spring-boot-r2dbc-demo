package com.hendisantika.springbootr2dbcdemo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 17:39
 * To change this template use File | Settings | File Templates.
 */
@Data
@ToString
@NoArgsConstructor
public class Customer {
    @Id
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
    private String country;
    private Boolean isActive;
}
