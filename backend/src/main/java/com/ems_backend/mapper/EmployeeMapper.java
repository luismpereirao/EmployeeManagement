package com.ems_backend.mapper;

import com.ems_backend.dto.EmployeeDTO;
import com.ems_backend.entity.Employee;

public class EmployeeMapper {
    public static Employee mapToEntity(EmployeeDTO employeeDTO) {
        return new Employee(
                employeeDTO.getId(),
                employeeDTO.getFirstname(),
                employeeDTO.getLastname(),
                employeeDTO.getEmail()
        );
    }

    public static EmployeeDTO mapToDTO(Employee employee) {
        return new EmployeeDTO(
                employee.getId(),
                employee.getFirstname(),
                employee.getLastname(),
                employee.getEmail());
    }
}
