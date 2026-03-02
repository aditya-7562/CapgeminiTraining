package LibraryManagement.service;

import LibraryManagement.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<User> users = new ArrayList<>();

    public void registerUser(User user) {
        users.add(user);
    }

    public boolean validateUser(String email, String password) {
        return users.stream().anyMatch(u -> u.getEmail().equals(email) && u.getPassword().equals(password));
    }
}