package spring.security.project.service;

import spring.security.project.model.User;

public interface AuthenticationService {
    User register(String email, String password);
}
