package com.sandeep.portfolio.service;

import com.sandeep.portfolio.dto.ProjectDTO;
import com.sandeep.portfolio.entity.Project;
import com.sandeep.portfolio.repository.Projectrepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProjectService {
    private Projectrepo projectrepo;
    public ProjectService(Projectrepo projectrepo) {
        this.projectrepo = projectrepo;
    }

    public List<ProjectDTO> getProjects(){

        List<ProjectDTO> dtos = new ArrayList<>();
        List<Project> project = projectrepo.findAll();
        for(Project p : project) {
            ProjectDTO dto = new ProjectDTO();
            dto.setTitle(p.getTitle());
            dto.setDescription(p.getDescription());
            dto.setTech_stack(p.getTech_stack());
            dto.setGithub_url(p.getGithub_url());
            dtos.add(dto);
        }
        return dtos;
    }

    public ProjectDTO getProject(Long id){
        ProjectDTO dto = new ProjectDTO();
        Project project = projectrepo.findById(id).orElseThrow(() -> new RuntimeException("Project not found"));;
        dto.setTitle(project.getTitle());
        dto.setDescription(project.getDescription());
        dto.setTech_stack(project.getTech_stack());
        dto.setGithub_url(project.getGithub_url());
        return dto;
    }

    public ProjectDTO addProject(ProjectDTO projectDTO){
        Project project = new Project();
        project.setTitle(projectDTO.getTitle());
        project.setDescription(projectDTO.getDescription());
        project.setTech_stack(projectDTO.getTech_stack());
        project.setGithub_url(projectDTO.getGithub_url());
        Project savedProject = projectrepo.save(project);

        ProjectDTO dto = new ProjectDTO();

        dto.setTitle(savedProject.getTitle());
        dto.setDescription(savedProject.getDescription());
        dto.setTech_stack(savedProject.getTech_stack());
        dto.setGithub_url(savedProject.getGithub_url());

        return dto;
    }

    public ProjectDTO updateProject(ProjectDTO projectDTO,Long id){
        Project project = projectrepo.findById(id).orElseThrow(() -> new RuntimeException("Project not found"));;
        project.setTitle(projectDTO.getTitle());
        project.setDescription(projectDTO.getDescription());
        project.setTech_stack(projectDTO.getTech_stack());
        project.setGithub_url(projectDTO.getGithub_url());
        Project project1 = projectrepo.save(project);
        ProjectDTO dto = new ProjectDTO();
        dto.setTitle(project1.getTitle());
        dto.setDescription(project1.getDescription());
        dto.setTech_stack(project1.getTech_stack());
        dto.setGithub_url(project1.getGithub_url());
        return dto;
    }

    public void deleteProject(Long id){
        Project project = projectrepo.findById(id).orElseThrow(() -> new RuntimeException("Project not found"));;
        projectrepo.delete(project);
    }
}
