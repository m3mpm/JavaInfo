package web.info.mapper;

import web.info.model.dto.TimeTrackingDto;
import web.info.model.entity.TimeTracking;
import org.mapstruct.*;

@Mapper(uses = PeerMapper.class)
public abstract class TimeTrackingMapper extends GenericMapper<TimeTracking, TimeTrackingDto> {
}

