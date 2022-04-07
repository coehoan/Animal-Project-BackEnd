package site.metacoding.animalprojectbackend.web.animalapi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.animalprojectbackend.domain.sigungu.SigunguDto;
import site.metacoding.animalprojectbackend.service.api.SigunguService;

@RequiredArgsConstructor
@Controller
public class SigunguController {

    private final SigunguService sigunguService;
    
    @GetMapping("/sigungu/busan")
    public String download(SigunguDto sigunguDto, Model model) {

        List<SigunguDto> sigunguEntity = sigunguService.부산다운로드(sigunguDto);

        model.addAttribute("busanlist", sigunguEntity);

        return "/api/sigunguDownload";
    }

    @GetMapping("/sigungu/deagu")
    public String deagu(SigunguDto sigunguDto, Model model) {
        
        List<SigunguDto> sigunguEntity = sigunguService.대구다운로드(sigunguDto);

        model.addAttribute("deagulist", sigunguEntity);

        return "/api/sigunguDownload";
    }

    @GetMapping("/sigungu/incheon")
    public String incheon(SigunguDto sigunguDto, Model model) {
        
        List<SigunguDto> sigunguEntity = sigunguService.인천다운로드(sigunguDto);

        model.addAttribute("incheonlist", sigunguEntity);

        return "/api/sigunguDownload";
    }
}