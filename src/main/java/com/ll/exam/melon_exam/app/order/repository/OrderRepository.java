package com.ll.exam.melon_exam.app.order.repository;

import com.ll.exam.melon_exam.app.order.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}