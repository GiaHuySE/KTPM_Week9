package com.example.SpringBootRedis.Repository;
import org.springframework.data.repository.CrudRepository;

import com.example.SpringBootRedis.model.Student;
public interface StudentRepository extends CrudRepository<Student, String> {
}