
package com.example.service;

import com.example.model.Employee;
import java.util.List;
import java.util.Optional;


public interface Employeeservice {
    public Employee addEmployee(Employee employee);
    
    public String removeEmployee(int id);
   
    public Optional<Employee> findbyid(int id);
    
    public List<Employee> getallEmployee();
    public String updateEmployee(int id,Employee employee);
}
