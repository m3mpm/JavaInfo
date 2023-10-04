package web.info.controller;

import web.info.mapper.RecommendationMapper;
import web.info.model.dto.RecommendationDto;
import web.info.model.entity.Recommendation;
import web.info.service.RecommendationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/recommendation")
public class RecommendationController extends GenericController<Recommendation, RecommendationDto, Long> {
    @Autowired
    public RecommendationController(RecommendationService service, RecommendationMapper mapper) {
        super(service, mapper, RecommendationDto.class);
    }
}
