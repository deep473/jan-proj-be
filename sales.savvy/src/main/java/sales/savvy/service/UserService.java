package sales.savvy.service;

import java.util.Optional;
import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;

public interface UserService {
    String addUser(User user);
    Optional<User> getUser(String username);
    String validateUser(LoginData data);
}
