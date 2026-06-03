package com.sayat.lmsmainservice.mapper;

import com.sayat.lmsmainservice.dto.CourseDto;
import com.sayat.lmsmainservice.entity.Course;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CourseMapper {

    CourseDto toDto(Course course);

    Course toEntity(CourseDto dto);
}