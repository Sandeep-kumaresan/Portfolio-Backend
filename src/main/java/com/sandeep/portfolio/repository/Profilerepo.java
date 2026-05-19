package com.sandeep.portfolio.repository;

import com.sandeep.portfolio.entity.Profile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Profilerepo extends JpaRepository<Profile,Long> {
}
