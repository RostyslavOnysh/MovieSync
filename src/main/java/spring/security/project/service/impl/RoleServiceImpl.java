package spring.security.project.service.impl;

import java.util.NoSuchElementException;
import spring.security.project.dao.RoleDao;
import spring.security.project.model.Role;
import spring.security.project.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    public Role add(Role role) {
        return roleDao.add(role);
    }

    @Override
    public Role getByName(String roleName) {
        return roleDao.getByName(roleName).orElseThrow(
                () -> new NoSuchElementException("Error,cant find role by name: " + roleName));
    }
}
