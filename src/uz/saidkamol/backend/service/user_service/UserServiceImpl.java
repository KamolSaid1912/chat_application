package uz.saidkamol.backend.service.user_service;

import uz.saidkamol.backend.model.user.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private static UserService userService;

    private List<User> users;

    public UserServiceImpl() {
        this.users = new ArrayList<>();
        users.add(new User("Saidkamol", 17, "saidKamol1912", "12345"));
    }

    public static UserService getInstance() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }

    @Override
    public Optional<User> findUser(String nickname, String password) {
        for (User user : users) {
            if (user.getNickname().equals(nickname) && user.getPassword().equals(password)) {
                return Optional.of(user);
            }
        }
        return Optional.empty();
    }

    @Override
    public void createAndAddUser(String name, Integer age, String nick, String password) {
        User user = new User(name, age, nick, password);

        users.add(user);
    }
}
