package com.example.entityPractice.service;

import com.example.entityPractice.TimeTrace;
import com.example.entityPractice.domain.IdentityStudent;
import com.example.entityPractice.domain.SequenceStudent;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final IdentityStudentRepository identityStudentRepository;
    private final SequenceStudentRepository sequenceStudentRepository;
    private int insertNum=10000;

    @TimeTrace
    public void saveIdentity(){
        for(int i=0; i<insertNum;i++){
            System.out.println("save I: "+i);
            identityStudentRepository.save(IdentityStudent.builder()
                    .num(i)
                    .build());
        }
    }
    @TimeTrace
    public void saveSequence(){
        for(int i=0; i<insertNum;i++){
            System.out.println("save I: "+i);
            sequenceStudentRepository.save(SequenceStudent.builder()
                    .num(i)
                    .build());
        }
    }

}
