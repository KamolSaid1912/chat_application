package uz.saidkamol.backend.service.user_service;

import uz.saidkamol.backend.model.user.User;

import java.util.Optional;

public interface UserService {
    Optional<User> findUser(String nickname, String password);

    void createAndAddUser(String name, Integer age, String nick, String password);
}
