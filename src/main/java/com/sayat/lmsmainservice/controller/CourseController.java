package com.sayat.lmsmainservice.controller;

import com.sayat.lmsmainservice.dto.CourseDto;
import com.sayat.lmsmainservice.service.CourseService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/courses")
@RequiredArgsConstructor
public class CourseController {

    private final CourseService courseService;

    @PostMapping
    @Operation(summary = "Create course")
    public void createCourse(@RequestBody CourseDto dto) {
        courseService.createCourse(dto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update course")
    public void updateCourse(
            @PathVariable Long id,
            @RequestBody CourseDto dto) {

        courseService.updateCourse(id, dto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete course")
    public void deleteCourse(@PathVariable Long id) {
        courseService.deleteCourse(id);
    }
}