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


}
