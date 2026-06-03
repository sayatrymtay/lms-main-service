package com.sayat.lmsmainservice.repository;

import com.sayat.lmsmainservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}