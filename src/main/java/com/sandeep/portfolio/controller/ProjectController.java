package com.sandeep.portfolio.controller;

import com.sandeep.portfolio.dto.ProjectDTO;
import com.sandeep.portfolio.entity.Project;
import com.sandeep.portfolio.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProjectController {
    private ProjectService projectService;
    public ProjectController(ProjectService projectService){
        this.projectService = projectService;
    }

    @GetMapping("/projects")
    public List<ProjectDTO> getProjects(){
        return projectService.getProjects();
    }
}
