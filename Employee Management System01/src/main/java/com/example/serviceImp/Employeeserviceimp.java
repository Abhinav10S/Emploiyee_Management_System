
package com.example.serviceImp;

import com.example.model.Employee;
import com.example.repository.Employeerepo;
import com.example.service.Employeeservice;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class Employeeserviceimp implements Employeeservice{

    @Autowired
    private Employeerepo employeerepo;
    
    @Override
    public Employee addEmployee(Employee employee) {
     Employee emp=   employeerepo.save(employee);
        return emp;
    }

    @Override
    public String removeEmployee(int id) {
       employeerepo.deleteById(id);
       return "delete data successsfully";
        
    }

    @Override
    public Optional<Employee> findbyid(int id) {
        Optional<Employee> emp=  employeerepo.findById(id);
        if(emp.isPresent()){
            return emp;
        }else{
         return null;   
        }
    
    }

    @Override
    public List<Employee> getallEmployee() {
        List<Employee> emplist =employeerepo.findAll();
        return emplist;
    }

    @Override
    public String updateEmployee(int id, Employee employee) {
        Optional<Employee> emp=employeerepo.findById(id);
        if(emp.isPresent()){
            Employee exitEmp=emp.get();
          exitEmp.setName(employee.getName());
          exitEmp.setAge(employee.getAge());
          exitEmp.setAddress(employee.getAddress());
          exitEmp.setSalary(employee.getSalary());
          
            employeerepo.save(exitEmp);
            
            
            
            return "update  sucessfully";
        }
        else{
            
            return "employee not found";
        }
    }
    
}
