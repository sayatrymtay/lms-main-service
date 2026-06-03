package com.sayat.lmsmainservice.controller;

import com.sayat.lmsmainservice.dto.ChapterDto;
import com.sayat.lmsmainservice.service.ChapterService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/chapters")
@RequiredArgsConstructor
public class ChapterController {

    private final ChapterService chapterService;

    @PostMapping
    @Operation(summary = "Create chapter")
    public void createChapter(@RequestBody ChapterDto dto) {
        chapterService.createChapter(dto);
    }

    @PutMapping("/{id}")
    @Operation(summary = "Update chapter")
    public void updateChapter(
            @PathVariable Long id,
            @RequestBody ChapterDto dto) {

        chapterService.updateChapter(id, dto);
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Delete chapter")
    public void deleteChapter(@PathVariable Long id) {
        chapterService.deleteChapter(id);
    }
}