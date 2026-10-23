package main.model;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 23.10.2026
 * <p>
 * Time: 14:30
 * <p>
 * Project name: studentWork
 */
public class Teacher extends User {
    private double salary;

    public Teacher(String name, String email, String password, double salary) {
        super(name, email, password);
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}
