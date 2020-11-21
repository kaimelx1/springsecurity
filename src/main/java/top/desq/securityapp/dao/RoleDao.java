package top.desq.securityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.desq.securityapp.model.Role;

public interface RoleDao extends JpaRepository<Role, Long> {
}
