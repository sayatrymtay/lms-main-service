package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.LessonDto;
import com.sayat.lmsmainservice.mapper.LessonMapper;
import com.sayat.lmsmainservice.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class LessonService {

    private final LessonRepository lessonRepository;
    private final LessonMapper lessonMapper;

    public void createLesson(LessonDto lessonDto) {

        log.info("Creating new lesson");

        log.debug("Lesson data: {}", lessonDto);

    }

    public void updateLesson(Long id, LessonDto lessonDto) {

        log.info("Updating lesson with id {}", id);

        log.debug("Updated lesson data: {}", lessonDto);

    }

    public void deleteLesson(Long id) {

        log.info("Deleting lesson with id {}", id);

    }
}