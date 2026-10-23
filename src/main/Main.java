package main;

import main.model.Student;
import main.model.User;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 21.10.2026
 * <p>
 * Time: 14:11
 * <p>
 * Project name: studentWork
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Not hello");

        User testUser = new User("Polina", "polina@gmail.com", "1111");
        User testUser2 = new Student("Vova", "vova@gmail.com", "2222", "CD:12342", "SHID-33");
        System.out.println(testUser);
        System.out.println(testUser2);
    }
}
