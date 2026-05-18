package com.sandeep.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDTO {
    private String name;
    private String title;
    private String about;
    private String resumeUrl;
    private String githubUrl;
    private String linkedinUrl;
    private String profileImageUrl;
}
