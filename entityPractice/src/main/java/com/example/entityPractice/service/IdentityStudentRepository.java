package com.example.entityPractice.service;

import com.example.entityPractice.domain.IdentityStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityStudentRepository extends JpaRepository<IdentityStudent,Long> {
}
