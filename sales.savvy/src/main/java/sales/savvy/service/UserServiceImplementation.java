package sales.savvy.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sales.savvy.dto.LoginData;
import sales.savvy.entity.User;
import sales.savvy.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
    @Autowired
    private UserRepository repo;

    @Override
    public String addUser(User user) {
        // Check if username already exists
        Optional<User> existing = repo.findByUsername(user.getUsername());
        if (existing.isPresent()) {
            return "fail";   // already taken
        }
        // New username — save
        repo.save(user);
        return "success";
    }

    @Override
    public Optional<User> getUser(String username) {
        // Just wrap repo call
        return repo.findByUsername(username);
    }

    @Override
    public String validateUser(LoginData data) {
        // Look up by username
        Optional<User> optUser = repo.findByUsername(data.getUsername());
        if (!optUser.isPresent()) {
            return "invalid";  // no such user
        }
        User u = optUser.get();
        // Check password
        if (!u.getPassword().equals(data.getPassword())) {
            return "invalid";  // wrong password
        }
        // Return role
        return u.getRole().equalsIgnoreCase("ADMIN") ? "admin" : "customer";
    }
}
