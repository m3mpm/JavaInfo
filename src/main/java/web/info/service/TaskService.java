package web.info.service;

import web.info.model.entity.Task;
import web.info.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService extends GenericService<Task, String> {
    @Autowired
    public TaskService(TaskRepository taskRepository) {
        super(taskRepository);
    }
}
