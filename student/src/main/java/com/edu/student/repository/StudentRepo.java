package com.edu.student.repository;

import com.edu.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Long> {
    boolean existsByEmail(String email);
}
