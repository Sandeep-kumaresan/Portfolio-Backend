package com.sandeep.portfolio.controller;

import com.sandeep.portfolio.dto.ProfileDTO;

import com.sandeep.portfolio.entity.Profile;
import com.sandeep.portfolio.service.ProfileService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfileController {
    private ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

    @GetMapping("/profile")
    public ProfileDTO getProfile(@RequestParam Long id){
        return profileService.getProfile(id);
    }

    @PostMapping("/save-profile")
    public Profile saveProfile(@RequestBody ProfileDTO profileDTO){
        return profileService.saveProfile(profileDTO);
    }

    @PutMapping("/update-profile")
    public Profile updateProfile(@RequestBody ProfileDTO profileDTO, @RequestParam Long id){
        return profileService.updateProfile(profileDTO,id);
    }
}
