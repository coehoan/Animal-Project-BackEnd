package site.metacoding.animalprojectbackend.web.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import site.metacoding.animalprojectbackend.domain.sido.SidoDto;
import site.metacoding.animalprojectbackend.domain.sido.SidoRepository;
import site.metacoding.animalprojectbackend.domain.sigungu.SigunguDto;

@RequiredArgsConstructor
@RestController
public class TestService {

    private final SidoRepository sidoRepository;

    @GetMapping("/test")
    public String 테스트() {

        List<SigunguDto> lists = new ArrayList<>();

        // 서비스키
        String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";

        // 시도 코드에 따른 변수들
        String gwangju = "6290000";
        String busan = "6260000";

        List<SidoDto> sidoEntity = sidoRepository.findAll();
        List<SidoDto> sidoRepo = sidoRepository.findAll();

        StringBuffer urisb = new StringBuffer();

        for (int i = 0; i < sidoEntity.size(); i++) {
            if (sidoRepo.get(i).getOrgCd().equals("6290000")) { // 광주

                urisb.append("http://apis.data.go.kr/1543061/abandonmentPublicSrvc/sigungu?");
                urisb.append("serviceKey=" + key);
                urisb.append("&upr_cd=");
                urisb.append(gwangju);
                urisb.append("&_type=JSON");

                System.out.println(urisb);

            }
        }

        System.out.println(urisb);

        return urisb.toString();
    }
}