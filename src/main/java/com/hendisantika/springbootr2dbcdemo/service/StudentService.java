package com.hendisantika.springbootr2dbcdemo.service;

import com.hendisantika.springbootr2dbcdemo.dto.StudentRequest;
import com.hendisantika.springbootr2dbcdemo.entity.Student;
import com.hendisantika.springbootr2dbcdemo.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 11:11
 * To change this template use File | Settings | File Templates.
 */
@Service
@RequiredArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public Flux<Student> findAll() {
        return studentRepository.findAll()
                .delayElements(Duration.ofSeconds(1));
    }

    public Mono<Student> findById(Long id) {
        return studentRepository.findById(id);
    }

    public Mono<Student> save(StudentRequest request) {
        return studentRepository.save(
                Student.builder()
                        .firstname(request.getFirstname())
                        .lastname(request.getLastname())
                        .age(request.getAge())
                        .build()
        );
    }

    public Flux<Student> findByFirstname(String firstname) {
        return studentRepository.findAllByFirstnameContainingIgnoreCase(firstname);
    }

    public void deleteById(Long id) {
        studentRepository.deleteById(id).subscribe();
    }
}
