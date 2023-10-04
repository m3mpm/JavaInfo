package web.info.mapper;

import web.info.model.dto.VerterDto;
import web.info.model.entity.Verter;
import org.mapstruct.*;

@Mapper(uses = CheckMapper.class )
public abstract class VerterMapper extends GenericMapper<Verter, VerterDto> {
}
