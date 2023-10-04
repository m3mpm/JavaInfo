package web.info.mapper;

import web.info.model.dto.RecommendationDto;
import web.info.model.entity.Recommendation;
import org.mapstruct.*;

@Mapper(uses = PeerMapper.class)
public abstract class RecommendationMapper extends GenericMapper<Recommendation, RecommendationDto> {
}
