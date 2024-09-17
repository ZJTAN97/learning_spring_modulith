package com.learning.spring.modulith.demo.orders;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
class OrderService {

    private final OrderRepository orderRepository;

    private final ApplicationEventPublisher applicationEventPublisher;

    OrderService(OrderRepository orderRepository, ApplicationEventPublisher applicationEventPublisher) {
        this.orderRepository = orderRepository;
        this.applicationEventPublisher = applicationEventPublisher;
    }

    void create(Order order) {
        var saved = this.orderRepository.save(order);
        System.out.println(saved);

        this.applicationEventPublisher.publishEvent(new OrderPlacedEvent(saved.id()));

    }

}
