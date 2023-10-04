package web.info.repository;

import web.info.model.entity.Task;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends GenericRepository<Task, String> {
}
