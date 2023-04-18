package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<User> users = new ArrayList<User>();
        Collections.addAll(users,
                new User(1, "AAA", 2.5),
                new User(2, "BBB", 3.8),
                new User(3, "CCC", 4.1)
        );

        UsersRepository usersRepository = new UsersRepository(users);

        User user1 = usersRepository.getUser(1l);
        User user2 = usersRepository.getUser("AAA");

        System.out.println(user1);
        System.out.println(user2);
    }
}
