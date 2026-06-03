package com.sayat.lmsmainservice.controller;

import com.sayat.lmsmainservice.dto.LessonDto;
import com.sayat.lmsmainservice.service.LessonService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/lessons")
@RequiredArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @PostMapping
    @Operation(summary = "Create lesson")
    public void createLesson(@RequestBody LessonDto dto) {
        lessonService.createLesson(dto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update lesson")
    public void updateLesson(
            @PathVariable Long id,
            @RequestBody LessonDto dto) {

        lessonService.updateLesson(id, dto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete lesson")
    public void deleteLesson(@PathVariable Long id) {
        lessonService.deleteLesson(id);
    }
}