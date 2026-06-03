package com.sayat.lmsmainservice.service;

import com.sayat.lmsmainservice.dto.ChapterDto;
import com.sayat.lmsmainservice.mapper.ChapterMapper;
import com.sayat.lmsmainservice.repository.ChapterRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ChapterService {

    private final ChapterRepository chapterRepository;
    private final ChapterMapper chapterMapper;

    public void createChapter(ChapterDto chapterDto) {

        log.info("Creating new chapter");

        log.debug("Chapter data: {}", chapterDto);

    }

    public void updateChapter(Long id, ChapterDto chapterDto) {

        log.info("Updating chapter with id {}", id);

        log.debug("Updated chapter data: {}", chapterDto);

    }

    public void deleteChapter(Long id) {

        log.info("Deleting chapter with id {}", id);

    }
}