package com.clayn.mmeserver.repository;

import com.clayn.mmeserver.model.ModPreview;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ModPreviewRepository extends JpaRepository<ModPreview, Integer> {
    Page<ModPreview> findModPreviewsByTitleContaining(String title, Pageable pageable);
}
