package com.springproject.restapiemployee.repositories;

import com.springproject.restapiemployee.models.Employee;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeDAO {

    long id = 0;
    List<Employee> employees = new ArrayList<>();
    {
//        employees.add(Employee.builder().id(++id).name("Boris").surname("Guskovsky").build());
//        employees.add(Employee.builder().id(++id).name("Boris2").surname("Guskovsky2").build());
//        employees.add(Employee.builder().id(++id).name("Boris3").surname("Guskovsky3").build());
    }
    public List<Employee> findAllEmployees(){
        return employees;
    }
    public Employee addEmployee(Employee employee){
        employees.add(employee);
        return employee;
    }
    public Employee findEmployee(long id){
        return employees.stream().filter((el)-> el.getId() == id).findFirst().orElse(null);
    }

    public Employee updateEmployee(Employee employee){
       var ee =  employees.stream().filter((el)-> el.getId() == employee.getId()).findFirst().get();
       employees.set(employees.indexOf(ee),employee);
       return employee;
    }
    public void deleteEmployee(long id){
        try {
            employees.remove(findEmployee(id));
        }
        catch (Exception ex){}
    }

    public void deleteAllEmployees(){
        employees.clear();
    }
}
