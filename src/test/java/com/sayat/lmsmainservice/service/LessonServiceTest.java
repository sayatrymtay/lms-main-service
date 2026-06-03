package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.LessonDto;
import com.sayat.lmsmainservice.mapper.LessonMapper;
import com.sayat.lmsmainservice.repository.LessonRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class LessonServiceTest {

    @Mock
    private LessonRepository lessonRepository;

    @Mock
    private LessonMapper lessonMapper;

    @InjectMocks
    private LessonService lessonService;

    @Test
    void createLessonTest() {

        LessonDto dto = new LessonDto();

        assertDoesNotThrow(() ->
                lessonService.createLesson(dto));
    }

    @Test
    void updateLessonTest() {

        LessonDto dto = new LessonDto();

        assertDoesNotThrow(() ->
                lessonService.updateLesson(1L, dto));
    }

    @Test
    void deleteLessonTest() {

        assertDoesNotThrow(() ->
                lessonService.deleteLesson(1L));
    }
}