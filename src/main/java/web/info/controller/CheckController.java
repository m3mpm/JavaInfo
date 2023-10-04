package web.info.controller;

import web.info.mapper.CheckMapper;
import web.info.model.dto.CheckDto;
import web.info.model.entity.Check;
import web.info.service.CheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/check")
public class CheckController extends GenericController<Check, CheckDto, Long> {
    @Autowired
    public CheckController(CheckService checkService, CheckMapper checkMapper) {
        super(checkService, checkMapper, CheckDto.class);
    }
}
