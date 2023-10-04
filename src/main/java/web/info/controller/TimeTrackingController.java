package web.info.controller;

import web.info.mapper.TimeTrackingMapper;
import web.info.model.dto.TimeTrackingDto;
import web.info.model.entity.TimeTracking;
import web.info.service.TimeTrackingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/time_tracking")
public class TimeTrackingController extends GenericController<TimeTracking, TimeTrackingDto, Long> {
    @Autowired
    public TimeTrackingController(TimeTrackingService service, TimeTrackingMapper mapper) {
        super(service, mapper, TimeTrackingDto.class);
    }
}
