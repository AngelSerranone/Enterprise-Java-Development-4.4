package com.ironhack.lab4_4.controller.interfaces;
import com.ironhack.lab4_4.dto.DepartmentDto;
import com.ironhack.lab4_4.dto.NameDto;
import com.ironhack.lab4_4.dto.StatusDto;
import com.ironhack.lab4_4.enums.Status;
import com.ironhack.lab4_4.model.Employee;

public interface IEmployeeController {

    // Create a route to add a new employee
    public Employee addNewEmployee(Employee employee);

    // Create a route to change an employee's status
    public void changeEmployeeStatus(Integer employeeId, StatusDto status);

    // Create a route to update an employee's name
    public void changeEmployeeName(Integer employeeId, NameDto name);

    // Create a route to update an employee's department
    public void changeEmployeeDepartment(Integer employeeId, DepartmentDto department);
}
