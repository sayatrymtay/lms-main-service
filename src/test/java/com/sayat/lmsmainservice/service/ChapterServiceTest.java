package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.ChapterDto;
import com.sayat.lmsmainservice.mapper.ChapterMapper;
import com.sayat.lmsmainservice.repository.ChapterRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class ChapterServiceTest {

    @Mock
    private ChapterRepository chapterRepository;

    @Mock
    private ChapterMapper chapterMapper;

    @InjectMocks
    private ChapterService chapterService;

    @Test
    void createChapterTest() {

        ChapterDto dto = new ChapterDto();

        assertDoesNotThrow(() ->
                chapterService.createChapter(dto));
    }

    @Test
    void updateChapterTest() {

        ChapterDto dto = new ChapterDto();

        assertDoesNotThrow(() ->
                chapterService.updateChapter(1L, dto));
    }

    @Test
    void deleteChapterTest() {

        assertDoesNotThrow(() ->
                chapterService.deleteChapter(1L));
    }
}