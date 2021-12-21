package az.xazar.msinquiry.repository;

import az.xazar.msinquiry.entity.DayOffEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayOffRepository extends JpaRepository<DayOffEntity,Long> {

    List<DayOffEntity> findAllByUserId(Long userId);
}
