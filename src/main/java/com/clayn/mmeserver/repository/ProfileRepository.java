package com.clayn.mmeserver.repository;

import com.clayn.mmeserver.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    Profile getProfileByUsername(String username);
}
