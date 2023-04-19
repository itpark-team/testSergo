package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UsersRepository {
    private Map<Long, User> usersAccounts;
    private Map<String, User> usersNames;
    private Map<Double, User> usersValues;

    public UsersRepository() {
        usersAccounts = new HashMap<Long, User>();
        usersNames = new HashMap<String, User>();
        usersValues = new HashMap<Double, User>();
    }

    public void addNew(User user) {
        usersAccounts.put(user.getAccount(), user);
        usersNames.put(user.getName(), user);
        usersValues.put(user.getValue(), user);
    }

    public User get(Long account) {
        return usersAccounts.get(account);
    }

    public User get(String name) {
        return usersNames.get(name);
    }

    public User get(Double value) {
        return usersValues.get(value);
    }

    private void removeFromAllMaps(User user) {
        usersAccounts.remove(user.getAccount());
        usersNames.remove(user.getName());
        usersValues.remove(user.getValue());
    }

    public void delete(Long account) {
        User foundUser = get(account);
        removeFromAllMaps(foundUser);

    }

    public void delete(String name) {
        User foundUser = get(name);
        removeFromAllMaps(foundUser);
    }

    public void delete(Double value) {
        User foundUser = get(value);
        removeFromAllMaps(foundUser);
    }

    public void update(Long account, User newUser) {
        User foundUser = get(account);
        removeFromAllMaps(foundUser);
        addNew(newUser);
    }

    public void update(String name, User newUser) {
        User foundUser = get(name);
        removeFromAllMaps(foundUser);
        addNew(newUser);
    }

    public void update(Double value, User newUser) {
        User foundUser = get(value);
        removeFromAllMaps(foundUser);
        addNew(newUser);
    }
}
