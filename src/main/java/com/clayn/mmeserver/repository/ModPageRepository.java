package com.clayn.mmeserver.repository;

import com.clayn.mmeserver.model.ModPage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ModPageRepository extends JpaRepository<ModPage, Integer> {
}
