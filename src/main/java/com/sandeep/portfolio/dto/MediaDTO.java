package com.sandeep.portfolio.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MediaDTO {
    private String title;
    private String description;
    private String type;
    private String imageUrl;
    private String thumbnailUrl;
    private Integer displayOrder;
}
