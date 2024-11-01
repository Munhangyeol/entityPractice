package com.example.entityPractice.service;

import com.example.entityPractice.domain.SequenceStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SequenceStudentRepository extends JpaRepository<SequenceStudent,Long> {
}
