package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.mapper.LessonMapper;
import com.sayat.lmsmainservice.repository.LessonRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LessonService {

    private final LessonRepository lessonRepository;
    private final LessonMapper lessonMapper;

}