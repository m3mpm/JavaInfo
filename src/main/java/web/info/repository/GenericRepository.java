package web.info.repository;

import web.info.model.entity.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface GenericRepository<E extends BaseEntity<V>, V> extends JpaRepository<E, V> {
}
