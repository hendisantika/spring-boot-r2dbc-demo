package com.hendisantika.springbootr2dbcdemo.repository;

import com.hendisantika.springbootr2dbcdemo.entity.Customer;
import org.springframework.data.repository.query.ReactiveQueryByExampleExecutor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

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
@Repository
public interface CustomerRepository extends ReactiveCrudRepository<Customer, Integer>, ReactiveQueryByExampleExecutor<Customer> {
}
