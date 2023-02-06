package com.project.ecom.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.ecom.model.OrderLineItems;

@Repository
public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems, Integer> {
}
