package web.info.controller;

import web.info.mapper.TransferredPointMapper;
import web.info.model.dto.TransferredPointsDto;
import web.info.model.entity.TransferredPoint;
import web.info.service.TransferredPointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/transferred_point")
public class TransferredPointController extends GenericController<TransferredPoint, TransferredPointsDto, Long> {
    @Autowired
    public TransferredPointController(TransferredPointService service, TransferredPointMapper mapper) {
        super(service, mapper, TransferredPointsDto.class);
    }
}
