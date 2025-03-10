package com.ems_backend.dto;

import lombok.*;

@Data
@AllArgsConstructor
@Builder
public class EmployeeDTO {
    private Long id;
    private String firstname;
    private String lastname;
    private String email;
}
