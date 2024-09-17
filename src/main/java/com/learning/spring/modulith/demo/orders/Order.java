package com.learning.spring.modulith.demo.orders;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("orders")
record Order(@Id Integer id, Set<LineItem> lineItems) {
}
