package org.sjarvind.webordersconsumer.repository;

import java.util.List;
import org.sjarvind.webordersconsumer.entity.WebOrderEntity;
import org.springframework.data.repository.CrudRepository;

public interface WebOrderRepository  extends CrudRepository<WebOrderEntity, Long> {
    List<WebOrderEntity> findByName(String name);
}
