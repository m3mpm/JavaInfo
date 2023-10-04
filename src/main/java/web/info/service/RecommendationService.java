package web.info.service;

import web.info.model.entity.Recommendation;
import web.info.repository.RecommendationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecommendationService extends GenericService<Recommendation, Long> {
    @Autowired
    public RecommendationService(RecommendationRepository recommendationRepository) {
        super(recommendationRepository);
    }
}
