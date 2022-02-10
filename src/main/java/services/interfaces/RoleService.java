package services.interfaces;

import models.Role;

public interface RoleService {
    void saveRole(Role role);
    void deleteRole(Role role);
    void updateRole(Role role);
}
