package spring.security.project.service;

import spring.security.project.model.Role;

public interface RoleService {
    Role add(Role role);

    Role getByName(String roleName);
}
