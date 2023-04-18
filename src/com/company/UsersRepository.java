package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersRepository {
    private Map<Long, User> usersAccounts;
    private Map<String, User> usersNames;
    private Map<Double, User> usersValues;

    public UsersRepository(List<User> users) {
        usersAccounts = new HashMap<Long, User>();
        usersNames = new HashMap<String, User>();
        usersValues = new HashMap<Double, User>();

        for (User user : users) {
            usersAccounts.put(user.getAccount(), user);
            usersNames.put(user.getName(), user);
            usersValues.put(user.getValue(), user);
        }
    }

    public User getUser(Long account) {
        return usersAccounts.get(account);
    }

    public User getUser(String name) {
        return usersNames.get(name);
    }

    public User getUser(Double value) {
        return usersValues.get(value);
    }
}
