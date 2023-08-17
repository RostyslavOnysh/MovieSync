package spring.security.project.dao;

import spring.security.project.model.ShoppingCart;
import spring.security.project.model.User;

public interface ShoppingCartDao {
    ShoppingCart add(ShoppingCart shoppingCart);

    ShoppingCart getByUser(User user);

    ShoppingCart update(ShoppingCart shoppingCart);
}
