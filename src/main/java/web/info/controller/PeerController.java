package web.info.controller;

import web.info.mapper.PeerMapper;
import web.info.model.dto.PeerDto;
import web.info.model.entity.Peer;
import web.info.service.PeerService;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/peer")
public class PeerController extends GenericController<Peer, PeerDto, String> {
    @Autowired
    public PeerController(PeerService peerService, PeerMapper peerMapper) {
        super(peerService, peerMapper, PeerDto.class);
    }

    @Override
    @PostMapping("update")
    public String update(Model model, @ModelAttribute("Model") @NotNull PeerDto dto, @RequestParam String nickname) {
        return super.update(model, dto, nickname);
    }
}