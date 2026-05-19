package com.sandeep.portfolio.repository;

import com.sandeep.portfolio.entity.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Mediarepo extends JpaRepository<Media,Long> {
}
