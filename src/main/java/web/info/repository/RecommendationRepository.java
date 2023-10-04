package web.info.repository;

import web.info.model.entity.Recommendation;
import org.springframework.stereotype.Repository;

@Repository
public interface RecommendationRepository extends GenericRepository<Recommendation, Long> {
}
