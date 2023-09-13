package com.example.demo.repositories;

import com.example.demo.model.OrderEntity;
import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.criteria.Order;
import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
    //List<Order> findOrdersByUser(User user);


}
