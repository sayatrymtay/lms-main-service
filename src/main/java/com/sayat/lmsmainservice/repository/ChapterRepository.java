package com.sayat.lmsmainservice.repository;

import com.sayat.lmsmainservice.entity.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ChapterRepository extends JpaRepository<Chapter, Long> {
}