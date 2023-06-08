package com.hendisantika.springbootr2dbcdemo.repository;

import com.hendisantika.springbootr2dbcdemo.entity.Student;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

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
public interface StudentRepository extends ReactiveCrudRepository<Student, Long> {
    Flux<Student> findAllByFirstnameContainingIgnoreCase(String firstname);
}
