package site.metacoding.animalprojectbackend.domain.detailshelter;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Items {
    private List<Item> item;
}