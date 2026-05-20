package com.sandeep.portfolio.controller;

import com.sandeep.portfolio.dto.ProjectDTO;
import com.sandeep.portfolio.entity.Project;
import com.sandeep.portfolio.service.ProjectService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/project")
    public ProjectDTO getProject(@RequestParam Long id){
        return projectService.getProject(id);
    }

    @PostMapping("/add-project")
    public ProjectDTO addProject(@RequestBody ProjectDTO projectDTO){
        return projectService.addProject(projectDTO);
    }

    @PutMapping("/update-project")
    public ProjectDTO updateProject(@RequestBody ProjectDTO projectDTO, @RequestParam Long id){
        return projectService.updateProject(projectDTO,id);
    }

    @DeleteMapping("/delete-project")
    public void deleteProject(@RequestParam Long id){
        projectService.deleteProject(id);
    }
}
