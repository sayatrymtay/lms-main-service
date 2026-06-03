package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.CourseDto;
import com.sayat.lmsmainservice.mapper.CourseMapper;
import com.sayat.lmsmainservice.repository.CourseRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

@ExtendWith(MockitoExtension.class)
class CourseServiceTest {

    @Mock
    private CourseRepository courseRepository;

    @Mock
    private CourseMapper courseMapper;

    @InjectMocks
    private CourseService courseService;

    @Test
    void createCourseTest() {

        CourseDto dto = new CourseDto();

        assertDoesNotThrow(() ->
                courseService.createCourse(dto));
    }

    @Test
    void updateCourseTest() {

        CourseDto dto = new CourseDto();

        assertDoesNotThrow(() ->
                courseService.updateCourse(1L, dto));
    }

    @Test
    void deleteCourseTest() {

        assertDoesNotThrow(() ->
                courseService.deleteCourse(1L));
    }
}