package org.sid.order_service.repository;

import org.sid.order_service.entities.Order;
import org.sid.order_service.entities.ProductItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OrderRepository extends JpaRepository<Order, Long> {


}
