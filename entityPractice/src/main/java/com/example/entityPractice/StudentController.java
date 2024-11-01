package com.example.entityPractice;

import com.example.entityPractice.service.StudentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;

@RestController
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;
    @TimeTrace
    @GetMapping("/identity")
    public String saveWithIdentity(){
        service.saveIdentity();
        return "!!";
    }
    @TimeTrace
    @GetMapping("/sequence")
    public String  saveWithSequence(){
       service.saveSequence();
        return "!!";
    }
}
