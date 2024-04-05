package uz.saidkamol.ui.views;

import uz.saidkamol.backend.model.user.User;
import uz.saidkamol.backend.service.user_service.UserService;
import uz.saidkamol.backend.service.user_service.UserServiceImpl;
import uz.saidkamol.ui.utils.Input;

import java.util.Optional;

public class LoginView {

    private static final UserService userService = UserServiceImpl.getInstance();

    public static User CURRENT_USER = null;

    public static void menu() {
        displayMenu();

        switch (Input.inputInt("Choose : ")) {
            case 1 -> registerUser();

            case 2 -> loginUser();
        }
    }

    private static void loginUser() {
        String nickname = Input.inputStr("Enter nickname : ");
        String password = Input.inputStr("Enter password : ");

        Optional<User> userOpt = userService.findUser(nickname, password);

        userOpt.ifPresentOrElse(user -> {
            CURRENT_USER = user;
            System.out.println("Hello! " + CURRENT_USER);
        }, () -> System.out.println("Mistake! Wrong nickname or password! "));
    }

    private static void registerUser() {
        System.out.println("Registration : ");
        String name = Input.inputStr("Name : ");
        Integer age = Input.inputInt("Age : ");
        String nick = Input.inputStr("Nickname : ");
        String password = Input.inputStr("Password : ");

        userService.createAndAddUser(name, age, nick, password);
    }

    private static void displayMenu() {
        System.out.println("""
                1. Registration
                2. Log In
                """);
    }
}
