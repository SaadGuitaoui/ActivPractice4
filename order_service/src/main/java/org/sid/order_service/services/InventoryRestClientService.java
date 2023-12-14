package org.sid.order_service.services;

import org.sid.order_service.model.Customer;
import org.sid.order_service.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.hateoas.PagedModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name= "inventory-service")

public interface InventoryRestClientService {
    @GetMapping("/products/{id}?projection=fullCustomer")
    public Product productById(@PathVariable Long id);

    @GetMapping("/products?projection=fullProduct")
    public PagedModel<Product> allProducts();
}
