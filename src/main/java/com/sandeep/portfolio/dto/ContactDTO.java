package com.sandeep.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactDTO {
    private String name;
    private String email;
    private String message;
//    private LocalDateTime createdAt;
}
