package com.company;

public class Main {

    public static void main(String[] args) {

        UsersRepository usersRepository = new UsersRepository();
        usersRepository.addNew(new User(1, "AAA", 2.5));
        usersRepository.addNew(new User(2, "BBB", 3.8));
        usersRepository.addNew(new User(3, "CCC", 4.1));

//        User user1 = usersRepository.get(1l);
//        User user2 = usersRepository.get("AAA");

        usersRepository.update("AAA", new User(1,"AAA1",2.8));

        //usersRepository.delete(1l);
        User user2 = usersRepository.get(2.8);

//        System.out.println(user1);
        System.out.println(user2);
    }
}
