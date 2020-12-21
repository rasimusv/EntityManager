package ru.itis;

import ru.itis.homework.EntityManager;
import ru.itis.homework.User;

public class Main {

    public static void main(String[] args) {
        EntityManager.save("users", new User(10L, "Rasim", "Garipov", true));
        EntityManager.createTable("users", User.class);
        EntityManager.findById("users", User.class, Long.class, 10L);
    }
}
