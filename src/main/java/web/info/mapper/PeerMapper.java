package web.info.mapper;

import web.info.model.dto.PeerDto;
import web.info.model.entity.Peer;
import web.info.service.PeerService;
import org.jetbrains.annotations.NotNull;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper
public abstract class PeerMapper extends GenericMapper<Peer, PeerDto> {
    @Autowired
    private PeerService peerService;

    public Peer map(String nickname) {
        return peerService.getById(nickname);
    }
    public String map(@NotNull Peer peer) {
        return peer.getNickname();
    }
}
