package top.desq.securityapp.service;

/**
 * Service for Security
 *
 * @author Aleksandr Vaschehnko
 * @version 1.0
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);
}
