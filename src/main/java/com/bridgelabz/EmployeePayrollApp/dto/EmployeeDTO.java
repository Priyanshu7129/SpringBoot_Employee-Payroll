package com.bridgelabz.EmployeePayrollApp.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeDTO {

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @Min(value = 1000, message = "Salary must be at least 1000")
    private int salary;
}
