package sales.savvy.service;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;

public interface UserService {

	void addUser(User user);

	User getUser(String username);

	String validateUser(LoginData data);

}
