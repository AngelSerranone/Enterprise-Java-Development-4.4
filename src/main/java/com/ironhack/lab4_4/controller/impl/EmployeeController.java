package com.ironhack.lab4_4.controller.impl;
import com.ironhack.lab4_4.controller.interfaces.IEmployeeController;
import com.ironhack.lab4_4.dto.DepartmentDto;
import com.ironhack.lab4_4.dto.NameDto;
import com.ironhack.lab4_4.dto.StatusDto;
import com.ironhack.lab4_4.model.Employee;
import com.ironhack.lab4_4.service.interfaces.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class EmployeeController implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    // 2. Create a route to add a new patient
    @PostMapping("/employee")
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addNewEmployee(@RequestBody @Valid Employee employee) {
        return employeeService.addNewEmployee(employee);
    }

    // 3. Create a route to change an employee's status
    @PatchMapping("/employee-status/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeStatus(@PathVariable Integer employeeId, @RequestBody @Valid StatusDto status){
        employeeService.changeEmployeeStatus(employeeId, status.getStatus());
    }

    // 4. Create a route to update an employee's name
    @PatchMapping("employee-name/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeName(@PathVariable Integer employeeId, @RequestBody @Valid NameDto name) {
        employeeService.changeEmployeeName(employeeId, name.getName());
    }

    // 5. Create a route to update an employee's department
    @PatchMapping("/employee-department/{employeeId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeEmployeeDepartment(@PathVariable Integer employeeId, @RequestBody @Valid DepartmentDto department) {
        employeeService.changeEmployeeDepartment(employeeId, department.getDepartment());
    }
}
