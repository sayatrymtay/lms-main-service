package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.mapper.ChapterMapper;
import com.sayat.lmsmainservice.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ChapterService {

    private final ChapterRepository chapterRepository;
    private final ChapterMapper chapterMapper;

}