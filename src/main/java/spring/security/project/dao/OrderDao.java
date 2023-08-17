package spring.security.project.dao;

import java.util.List;
import spring.security.project.model.Order;
import spring.security.project.model.User;

public interface OrderDao {
    Order add(Order order);

    List<Order> getOrdersHistory(User user);
}
