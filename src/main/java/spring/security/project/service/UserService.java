package spring.security.project.service;

import java.util.Optional;
import spring.security.project.model.User;

public interface UserService {
    User add(User user);

    User get(Long id);

    Optional<User> findByEmail(String email);
}
