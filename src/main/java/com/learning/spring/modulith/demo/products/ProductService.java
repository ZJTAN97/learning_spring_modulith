package com.learning.spring.modulith.demo.products;

import com.learning.spring.modulith.demo.orders.OrderPlacedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
class ProductService {

    @ApplicationModuleListener
    void on(OrderPlacedEvent orderPlacedEvent) throws Exception {
        System.out.println(orderPlacedEvent);
    }

}
