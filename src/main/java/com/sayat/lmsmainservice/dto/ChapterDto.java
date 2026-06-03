package com.sayat.lmsmainservice.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChapterDto {

    private Long id;

    private String name;

    private String description;

    private Integer orderNumber;

    private Long courseId;

    private LocalDateTime createdTime;

    private LocalDateTime updatedTime;
}