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
    public String downloadDog(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.dog(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }

    @GetMapping("/kind/cat")
    public String downloadCat(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.cat(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }

    @GetMapping("/kind/any")
    public String downloadAny(KindDto kindDto, Model model) {
        List<KindDto> kindEntity = kindService.any(kindDto);

        model.addAttribute("kindlist", kindEntity);

        return "/api/kindDownload";
    }
}
