package web.info.service;

import web.info.model.entity.Friend;
import web.info.repository.FriendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FriendService extends GenericService<Friend, Long> {
    @Autowired
    public FriendService(FriendRepository friendRepository) {
        super(friendRepository);
    }
}
