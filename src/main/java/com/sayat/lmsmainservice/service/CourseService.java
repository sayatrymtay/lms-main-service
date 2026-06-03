package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.mapper.CourseMapper;
import com.sayat.lmsmainservice.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final CourseMapper courseMapper;

}