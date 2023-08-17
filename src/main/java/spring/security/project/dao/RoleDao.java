package spring.security.project.dao;

import java.util.Optional;
import spring.security.project.model.Role;

public interface RoleDao {
    Role add(Role role);

    Optional<Role> getByName(String roleName);
}
