package web.info.mapper;

import web.info.model.dto.XpDto;
import web.info.model.entity.Xp;
import org.mapstruct.*;

@Mapper(uses = CheckMapper.class )
public abstract class XpMapper extends GenericMapper<Xp, XpDto> {
}

