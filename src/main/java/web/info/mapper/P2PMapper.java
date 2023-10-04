package web.info.mapper;

import web.info.model.dto.P2PDto;
import web.info.model.entity.P2P;
import org.mapstruct.*;

@Mapper(uses = { PeerMapper.class, CheckMapper.class })
public abstract class P2PMapper extends GenericMapper<P2P, P2PDto> {
}