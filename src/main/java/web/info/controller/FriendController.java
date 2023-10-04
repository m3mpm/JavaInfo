package web.info.controller;

import web.info.mapper.FriendMapper;
import web.info.model.dto.FriendDto;
import web.info.model.entity.Friend;
import web.info.service.FriendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/friend")
public class FriendController extends GenericController<Friend, FriendDto, Long> {
    @Autowired
    public FriendController(FriendService friendService, FriendMapper friendMapper) {
        super(friendService, friendMapper, FriendDto.class);
    }
}
