package com.example.spring_data_jpa.dao;

import com.example.spring_data_jpa.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    // Написал свой метод согласно конвенциям Spring Data JPA, реализовывать его не надо. Spring сам сделает
    List<Employee> findAllByName(String name);

}