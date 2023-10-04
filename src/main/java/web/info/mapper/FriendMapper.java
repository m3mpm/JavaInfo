package web.info.mapper;

import web.info.model.dto.FriendDto;
import web.info.model.entity.Friend;
import org.mapstruct.*;

@Mapper(uses = PeerMapper.class)
public abstract class FriendMapper extends GenericMapper <Friend, FriendDto> {
}
