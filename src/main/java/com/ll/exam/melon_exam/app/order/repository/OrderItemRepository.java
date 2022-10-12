package com.ll.exam.melon_exam.app.order.repository;

import com.ll.exam.melon_exam.app.order.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
