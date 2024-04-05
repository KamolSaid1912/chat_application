package uz.saidkamol.backend.model.user;

import java.util.UUID;

public class User {
    private final UUID id = UUID.randomUUID();

    private String name;
    private int age;
    private String nickname;
    private String password;

    public User(String name, int age, String nickname, String password) {
        this.name = name;
        this.age = age;
        this.nickname = nickname;
        this.password = password;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\u001B[35m" + nickname + "\u001B[0m";
    }
}
