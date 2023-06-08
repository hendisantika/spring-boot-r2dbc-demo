package com.hendisantika.springbootr2dbcdemo.service;

import com.hendisantika.springbootr2dbcdemo.entity.Customer;
import com.hendisantika.springbootr2dbcdemo.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 17:40
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class CustomerQueryService {

    private final CustomerRepository customerRepository;

    private final Map<String, String> countryMap = Map.of(
            "BR", "Brazil",
            "CH", "China",
            "ID", "Indonesia",
            "MY", "Malaysia",
            "PH", "Philippines",
            "JP", "Japan",
            "KR", "Korea",
            "SG", "Singapore",
            "US", "United States"
    );

    public Flux<Customer> search(Customer customer) {
        ExampleMatcher matcher = ExampleMatcher.matching()
                .withTransformer("country", op -> op.map(c -> countryMap.getOrDefault(c, "UNKNOWN")));
        return this.customerRepository.findAll(Example.of(customer, matcher));
    }

    public Flux<Customer> list() {
        return customerRepository.findAll();
    }
}
