package com.learning.spring.modulith.demo.orders;

import org.springframework.data.repository.ListCrudRepository;

interface OrderRepository extends ListCrudRepository<Order, Integer> {
}
