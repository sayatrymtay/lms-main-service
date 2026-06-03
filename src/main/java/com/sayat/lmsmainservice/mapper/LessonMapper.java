package com.sayat.lmsmainservice.mapper;

import com.sayat.lmsmainservice.dto.LessonDto;
import com.sayat.lmsmainservice.entity.Lesson;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LessonMapper {

    @Mapping(source = "chapter.id", target = "chapterId")
    LessonDto toDto(Lesson lesson);

    @Mapping(source = "chapterId", target = "chapter.id")
    Lesson toEntity(LessonDto dto);
}