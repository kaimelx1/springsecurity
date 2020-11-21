package top.desq.securityapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import top.desq.securityapp.model.User;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
