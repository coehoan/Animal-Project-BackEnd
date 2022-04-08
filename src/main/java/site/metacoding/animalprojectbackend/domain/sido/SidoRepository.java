package site.metacoding.animalprojectbackend.domain.sido;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SidoRepository extends JpaRepository<SidoDto, Integer> {
    
    @Query(value = "SELECT * FROM SidoDto WHERE orgCd", nativeQuery = true)
    List<SidoDto> findCd();

}
