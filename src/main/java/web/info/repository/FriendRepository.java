package web.info.repository;

import web.info.model.entity.Friend;
import org.springframework.stereotype.Repository;

@Repository
public interface FriendRepository extends GenericRepository<Friend, Long> {
}
