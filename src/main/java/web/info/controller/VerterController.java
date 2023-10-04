package web.info.controller;

import web.info.mapper.VerterMapper;
import web.info.model.dto.VerterDto;
import web.info.model.entity.Verter;
import web.info.service.VerterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/verter")
public class VerterController extends GenericController<Verter, VerterDto, Long>{
    @Autowired
    public VerterController(VerterService verterService, VerterMapper verterMapper) {
        super(verterService, verterMapper, VerterDto.class);
    }
}
