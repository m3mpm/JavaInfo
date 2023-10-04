package web.info.repository;

import web.info.model.entity.Check;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends GenericRepository<Check, Long> {
}
