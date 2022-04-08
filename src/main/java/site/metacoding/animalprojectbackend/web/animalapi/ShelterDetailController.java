package site.metacoding.animalprojectbackend.web.animalapi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.animalprojectbackend.domain.detailshelter.ShelterDto;
import site.metacoding.animalprojectbackend.service.api.ShelterService;

@RequiredArgsConstructor
@Controller
public class ShelterDetailController {

    private final ShelterService service;

    @GetMapping("/shelter/detail")
    public String Download(ShelterDto shelterDto, Model model) {

        List<ShelterDto> shelterEntity = service.detailDown(shelterDto);

        model.addAttribute("shelterlist", shelterEntity);

        return "/api/shelterDetailDownload";

    }
}
