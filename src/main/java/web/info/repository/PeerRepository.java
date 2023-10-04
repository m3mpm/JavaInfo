package web.info.repository;

import web.info.model.entity.Peer;
import org.springframework.stereotype.Repository;

@Repository
public interface PeerRepository extends GenericRepository<Peer, String> {
}
