package com.hendisantika.springbootr2dbcdemo.controller;

import com.hendisantika.springbootr2dbcdemo.dto.StudentRequest;
import com.hendisantika.springbootr2dbcdemo.entity.Student;
import com.hendisantika.springbootr2dbcdemo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-r2dbc-demo
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 6/8/23
 * Time: 11:12
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/students")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Mono<Student> findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Student> create(@RequestBody StudentRequest request) {
        return studentService.save(request);
    }

    @GetMapping("/filter")
    public Flux<Student> findByAuthor(@RequestParam String name) {
        return studentService.findByFirstname(name);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}
