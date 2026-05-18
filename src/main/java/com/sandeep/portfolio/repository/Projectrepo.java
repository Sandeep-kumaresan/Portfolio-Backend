package com.sandeep.portfolio.repository;

import com.sandeep.portfolio.entity.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Projectrepo extends JpaRepository<Project,Integer> {
}
