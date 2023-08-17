package spring.security.project.service;

import java.util.List;
import spring.security.project.model.Order;
import spring.security.project.model.ShoppingCart;
import spring.security.project.model.User;

public interface OrderService {
    Order completeOrder(ShoppingCart shoppingCart);

    List<Order> getOrdersHistory(User user);
}
