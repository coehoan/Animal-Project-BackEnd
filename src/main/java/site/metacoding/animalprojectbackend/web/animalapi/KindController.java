package site.metacoding.animalprojectbackend.web.animalapi;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;
import site.metacoding.animalprojectbackend.animalkind.kindservice.KindService;
import site.metacoding.animalprojectbackend.animalkind.modeling.KindDto;

@RequiredArgsConstructor
@Controller
public class KindController {
    private final KindService kindService;

    @GetMapping("/kind/dog")
    public String DD(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.dogDown(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }

    @GetMapping("/kind/cat")
    public String CD(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.catDown(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }

    @GetMapping("/kind/any")
    public String AD(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.anyDown(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }
}
