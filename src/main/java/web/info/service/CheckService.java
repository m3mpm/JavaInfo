package web.info.service;

import web.info.model.entity.Check;
import web.info.repository.CheckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckService extends GenericService<Check, Long> {
    @Autowired
    public CheckService(CheckRepository genericRepository) {
        super(genericRepository);
    }
}
