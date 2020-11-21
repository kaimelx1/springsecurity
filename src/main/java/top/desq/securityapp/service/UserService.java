package top.desq.securityapp.service;

import top.desq.securityapp.model.User;

/**
 * Service class for {@link top.desq.securityapp.model.User}
 *
 * @author Aleksandr Vashchenko
 * @version 1.0
 */
public interface UserService {

    void save(User user);

    User findByUsername(String username);
}
