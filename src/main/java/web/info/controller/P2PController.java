package web.info.controller;

import web.info.mapper.P2PMapper;
import web.info.model.dto.P2PDto;
import web.info.model.entity.P2P;
import web.info.service.P2PService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/p2p")
public class P2PController extends GenericController<P2P, P2PDto, Long> {
    @Autowired
    public P2PController(P2PService p2PService, P2PMapper p2PMapper) {
        super(p2PService, p2PMapper, P2PDto.class);
    }
}
