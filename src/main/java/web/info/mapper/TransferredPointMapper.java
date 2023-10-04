package web.info.mapper;

import web.info.model.dto.TransferredPointsDto;
import web.info.model.entity.TransferredPoint;
import org.mapstruct.*;

@Mapper(uses = PeerMapper.class)
public abstract class TransferredPointMapper extends GenericMapper<TransferredPoint, TransferredPointsDto>  {
}

