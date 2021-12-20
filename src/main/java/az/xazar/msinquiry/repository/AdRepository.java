package az.xazar.msinquiry.repository;

import az.xazar.msinquiry.entity.AdEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdRepository extends JpaRepository<AdEntity,Long> {
}
