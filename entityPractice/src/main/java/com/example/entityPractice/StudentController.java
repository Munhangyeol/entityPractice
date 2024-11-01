package com.example.entityPractice;

import com.example.entityPractice.service.StudentService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;
    @GetMapping("/identity")
    public void saveWithIdentity(){
        service.saveIdentity();
    }
    @GetMapping("/sequence")
    public void saveWithSequence(){
       service.saveSequence();
    }
}
