package com.springproject.restapiemployee.controllers;

import com.springproject.restapiemployee.models.Employee;
import com.springproject.restapiemployee.services.EmployeeService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v0.1/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @Operation(summary = "Вывод всех пользователей",
    description = "Выводит всех пользователей из списка")
    @GetMapping
    public List<Employee> findAllEmployees(){
        return employeeService.findAllEmployees();
    }

    @PostMapping("add_employee")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    @GetMapping("/{id}")
    public Employee findEmployee(@PathVariable long id) {
        return employeeService.findEmployee(id);
    }

    @PutMapping("update_employee")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("delete_employee/{id}")
    public void deleteEmployee(@PathVariable long id) {
        employeeService.deleteEmployee(id);
    }

    @DeleteMapping("delete_all_employees")
    public void deleteAllEmployees(){
        employeeService.deleteAllEmployees();
    }
}
