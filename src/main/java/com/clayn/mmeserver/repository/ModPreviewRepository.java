package com.clayn.mmeserver.repository;

import com.clayn.mmeserver.dtos.ModPreviewDTO;
import com.clayn.mmeserver.model.ModPreview;
import com.clayn.mmeserver.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.function.Predicate;

@Repository
public interface ModPreviewRepository extends JpaRepository<ModPreview, Integer> {
    Page<ModPreview> findModPreviewsByTitleContaining(String title, Pageable pageable);
}
