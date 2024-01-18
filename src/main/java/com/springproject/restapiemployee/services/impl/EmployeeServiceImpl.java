package com.springproject.restapiemployee.services.impl;

import com.springproject.restapiemployee.models.Employee;
import com.springproject.restapiemployee.repositories.EmployeeDAO;
import com.springproject.restapiemployee.services.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeDAO employeeDAO;
    @Override
    public List<Employee> findAllEmployees() {
        return employeeDAO.findAllEmployees();
    }

    @Override
    public Employee addEmployee(Employee employee) {
        return employeeDAO.addEmployee(employee);
    }

    @Override
    public Employee findEmployee(long id) {
        return employeeDAO.findEmployee(id);
    }

    @Override
    public Employee updateEmployee(Employee employee) {
        return employeeDAO.updateEmployee(employee);
    }

    @Override
    public void deleteEmployee(long id) {
        employeeDAO.deleteEmployee(id);
    }

    @Override
    public void deleteAllEmployees(){
        employeeDAO.deleteAllEmployees();
    }
}
