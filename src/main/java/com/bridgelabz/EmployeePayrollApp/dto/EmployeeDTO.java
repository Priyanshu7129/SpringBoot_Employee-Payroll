package com.bridgelabz.EmployeePayrollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data  // Auto-generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor  // Generates a no-args constructor
@AllArgsConstructor  // Generates a constructor with all arguments
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private int salary;
}
