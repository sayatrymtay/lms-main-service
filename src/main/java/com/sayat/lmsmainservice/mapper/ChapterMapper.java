package com.sayat.lmsmainservice.mapper;

import com.sayat.lmsmainservice.dto.ChapterDto;
import com.sayat.lmsmainservice.entity.Chapter;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ChapterMapper {

    @Mapping(source = "course.id", target = "courseId")
    ChapterDto toDto(Chapter chapter);

    @Mapping(source = "courseId", target = "course.id")
    Chapter toEntity(ChapterDto dto);
}