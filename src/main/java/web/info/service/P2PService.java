package web.info.service;

import web.info.model.entity.P2P;
import web.info.repository.P2PRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class P2PService extends GenericService<P2P, Long> {
    @Autowired
    public P2PService(P2PRepository p2pRepository) {
        super(p2pRepository);
    }
}
