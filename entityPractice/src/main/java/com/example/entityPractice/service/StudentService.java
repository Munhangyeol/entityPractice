package com.example.entityPractice.service;

import com.example.entityPractice.domain.IdentityStudent;
import com.example.entityPractice.domain.SequenceStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final IdentityStudentRepository identityStudentRepository;
    private final SequenceStudentRepository sequenceStudentRepository;

    public void saveIdentity(){
        for(int i=0; i<10000;i++){
            identityStudentRepository.save(IdentityStudent.builder()
                    .num(i)
                    .build());
        }
    }
    public void saveSequence(){
        for(int i=0; i<10000;i++){
            sequenceStudentRepository.save(SequenceStudent.builder()
                    .num(i)
                    .build());
        }
    }

}
