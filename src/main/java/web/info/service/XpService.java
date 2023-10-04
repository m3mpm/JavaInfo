package web.info.service;

import web.info.model.entity.Xp;
import web.info.repository.XpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class XpService extends GenericService<Xp, Long> {
    @Autowired
    public XpService(XpRepository xpRepository) {
        super(xpRepository);
    }
}
