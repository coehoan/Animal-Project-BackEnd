package site.metacoding.animalprojectbackend;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import site.metacoding.animalprojectbackend.domain.shelter.Shelter;
import site.metacoding.animalprojectbackend.domain.shelter.dto.ResponseDto;

public class ShelterTest {

    @Test
    public void test1(){
        // 서비스키
        String key = "jDqHGG%2BaNG47ijh6s3XzB%2BuF8fJOeovccnw%2FZtc9wLQUaKJumPo%2Frl1a2ygZ68dv9L0PD7drvpjPAeTnnB9f%2FQ%3D%3D";

        List<String> codeList = new ArrayList<>();
        codeList.add("6260000");
        codeList.add("6270000");

        List<String> sigunguList = new ArrayList<>();
        sigunguList.add("3360000");
        sigunguList.add("3440000");

        // 시군구 코드 부산 : 3360000, 대구 : 3440000
        // 부산시도 코드 : 6260000
        // 대구 시도 코드 : 6270000



        
        RestTemplate restTemplate = new RestTemplate();
        ResponseDto response = new ResponseDto();
        List<ResponseDto> shelterList = new ArrayList<>();
        List<Shelter> lists = new ArrayList<>();

        try {
            for (int i = 0; i < 2; i++) {
                System.out.println(1);
                StringBuffer urisb = new StringBuffer();
                urisb.append("http://apis.data.go.kr/1543061/abandonmentPublicSrvc/shelter?");
                urisb.append("serviceKey=" + key);
                urisb.append("&upr_cd=");
                urisb.append(codeList.get(i)); // 시도 코드
                urisb.append("&org_cd=");
                urisb.append(sigunguList.get(i)); // 시군구 코드
                urisb.append("&_type=JSON");
                System.out.println(2);

                URI uri = new URI(urisb.toString());

                //System.out.println(uri);

                response = restTemplate.getForObject(uri, ResponseDto.class);
                
                System.out.println(response);
                
            }

            for (int o = 0; o < response.getResponse().getBody().getItems().getItem().size(); o++) {
                shelterList.add(response);
            }


            for (int i = 0; i < shelterList.size(); i++) {
                Shelter shelters = new Shelter(i,
                        shelterList.get(i).getResponse().getBody().getItems().getItem().get(i).getCareRegNo(),
                        shelterList.get(i).getResponse().getBody().getItems().getItem().get(i).getCareNm());

                lists.add(shelters);
            }
            System.out.println(lists);

            // System.out.println(shelterList);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

        
    
    
}
