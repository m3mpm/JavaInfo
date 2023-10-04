package web.info.service;

import web.info.model.entity.Verter;
import web.info.repository.VerterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerterService extends GenericService<Verter, Long> {
    @Autowired
    public VerterService(VerterRepository verterRepository) {
        super(verterRepository);
    }
}
