package com.himal.skul;

import org.springframework.data.jpa.repository.JpaRepository;

import com.himal.skul.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
