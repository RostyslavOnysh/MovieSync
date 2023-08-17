package spring.security.project.service;

import spring.security.project.model.MovieSession;
import spring.security.project.model.ShoppingCart;
import spring.security.project.model.User;

public interface ShoppingCartService {
    void addSession(MovieSession movieSession, User user);

    ShoppingCart getByUser(User user);

    void registerNewShoppingCart(User user);

    void clear(ShoppingCart shoppingCart);
}
