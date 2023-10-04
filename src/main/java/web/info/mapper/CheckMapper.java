package web.info.mapper;

import web.info.model.dto.CheckDto;
import web.info.model.entity.Check;
import web.info.service.CheckService;
import org.jetbrains.annotations.NotNull;
import org.mapstruct.*;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(uses = { PeerMapper.class, TaskMapper.class })
public abstract class CheckMapper extends GenericMapper<Check, CheckDto> {
    @Autowired
    private CheckService checkService;

    public Long map(@NotNull Check check) {
        return check.getId();
    }
    public Check map(Long check) {
        return checkService.getById(check);
    }
}