package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.CourseDto;
import com.sayat.lmsmainservice.mapper.CourseMapper;
import com.sayat.lmsmainservice.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

    public void createCourse(CourseDto courseDto) {

        log.info("Creating new course");

        log.debug("Course data: {}", courseDto);

    }

    public void updateCourse(Long id, CourseDto courseDto) {

        log.info("Updating course with id {}", id);

        log.debug("Updated course data: {}", courseDto);

    }

    public void deleteCourse(Long id) {

        log.info("Deleting course with id {}", id);

    }
}