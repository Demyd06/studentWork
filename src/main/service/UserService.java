package main.service;

import main.model.User;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 23.10.2026
 * <p>
 * Time: 14:31
 * <p>
 * Project name: studentWork
 */
public class UserService {
    private User[] userList;

    public UserService(int sizeOfList) {
        this.userList = new User[sizeOfList];
    }

    public void addUser(User user) {
        this.userList[userList.length - 1] = user;
    }

}
