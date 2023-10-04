package web.info.repository;

import web.info.model.entity.CallBody;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomRequestRepository extends GenericRepository<CallBody, Long> {
}
