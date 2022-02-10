package services.implementations;

import dao.interfaces.RoleDao;
import models.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import services.interfaces.RoleService;


@Service
public class RoleServiceImp implements RoleService {
    private RoleDao roleDao;

    public RoleServiceImp() {
    }

    @Autowired
    public RoleServiceImp(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    public void saveRole(Role role) {
        roleDao.save(role);
    }

    public void deleteRole(Role role) {
        roleDao.delete(role);
    }

    public void updateRole(Role role) {
        roleDao.update(role);
    }

}
