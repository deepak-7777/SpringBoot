package com.deepak.Learning.Rest.APIs.repository;

import com.deepak.Learning.Rest.APIs.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
