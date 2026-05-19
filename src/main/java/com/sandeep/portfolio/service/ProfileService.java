package com.sandeep.portfolio.service;
import com.sandeep.portfolio.dto.ProfileDTO;
import com.sandeep.portfolio.entity.Profile;
import com.sandeep.portfolio.repository.Profilerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfileService {
    private final Profilerepo profilerepo;

    public ProfileService(Profilerepo profilerepo){
        this.profilerepo=profilerepo;
    }

    //@Autowired
    public ProfileDTO getProfile(Long id){
        Profile profile = profilerepo.findById(id).get();
        ProfileDTO dto = new ProfileDTO();
        dto.setName( profile.getName());
        dto.setTitle( profile.getTitle());
        dto.setAbout( profile.getAbout());
        dto.setLinkedinUrl( profile.getLinkedinUrl());
        dto.setGithubUrl( profile.getGithubUrl());
        dto.setResumeUrl( profile.getResumeUrl());
        dto.setProfileImageUrl(profile.getProfileImageUrl());
        return dto;
    }

    public Profile saveProfile(ProfileDTO profileDTO){
        Profile profile = new Profile();
        profile.setName(profileDTO.getName());
        profile.setTitle(profileDTO.getTitle());
        profile.setAbout(profileDTO.getAbout());
        profile.setLinkedinUrl(profileDTO.getLinkedinUrl());
        profile.setGithubUrl(profileDTO.getGithubUrl());
        profile.setResumeUrl(profileDTO.getResumeUrl());
        profile.setProfileImageUrl(profileDTO.getProfileImageUrl());
        return profilerepo.save(profile);

    }

    public Profile updateProfile(ProfileDTO profileDTO,Long id){
        Profile profile = profilerepo.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));;
        profile.setName(profileDTO.getName());
        profile.setTitle(profileDTO.getTitle());
        profile.setAbout(profileDTO.getAbout());
        profile.setLinkedinUrl(profileDTO.getLinkedinUrl());
        profile.setGithubUrl(profileDTO.getGithubUrl());
        profile.setResumeUrl(profileDTO.getResumeUrl());
        profile.setProfileImageUrl(profileDTO.getProfileImageUrl());
        return profilerepo.save(profile);
    }
//    @Autowired
//    public void setProfilerepo(Profilerepo profilerepo) {
//        this.profilerepo = profilerepo;
//    }
}
