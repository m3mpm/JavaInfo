package web.info.service;

import web.info.model.entity.Peer;
import web.info.repository.PeerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeerService extends GenericService<Peer, String> {
    @Autowired
    public PeerService(PeerRepository peerRepository) {
        super(peerRepository);
    }
}
