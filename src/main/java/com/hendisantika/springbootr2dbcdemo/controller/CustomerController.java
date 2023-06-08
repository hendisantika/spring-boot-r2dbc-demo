package com.hendisantika.springbootr2dbcdemo.controller;

import com.hendisantika.springbootr2dbcdemo.entity.Customer;
import com.hendisantika.springbootr2dbcdemo.service.CustomerQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 17:45
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerQueryService queryService;

    @GetMapping("search")
    public Flux<Customer> search(Customer customerSearchCriteria) {
        return this.queryService.search(customerSearchCriteria);
    }
}
