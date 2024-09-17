package com.learning.spring.modulith.demo.orders;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Set;

@Table("orders_line_items")
record LineItem(@Id Integer id, int product, int quantity) {
}
