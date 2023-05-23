
package com.example.repository;

import com.example.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;



public interface Employeerepo extends JpaRepository<Employee, Integer>{
    
}
