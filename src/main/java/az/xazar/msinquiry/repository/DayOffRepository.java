package az.xazar.msinquiry.repository;

import az.xazar.msinquiry.entity.DayOffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface DayOffRepository extends JpaRepository<DayOffEntity,Long> {

    Optional<List<DayOffEntity>> findAllByUserId(Long userId);

}
