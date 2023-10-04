package web.info.repository;

import web.info.model.entity.TimeTracking;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTrackingRepository extends GenericRepository<TimeTracking, Long> {
}
