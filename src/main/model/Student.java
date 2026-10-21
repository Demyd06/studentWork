package main.model;

/**
 *
 * Created by: Demyd Titenko
 * <p>
 * Date: 21.10.2026
 * <p>
 * Time: 14:27
 * <p>
 * Project name: studentWork
 */
public class Student extends User {
    String idCard;
    String course;

    public Student(String name, String email, String password, String idCard, String course) {
        super(name, email, password);
        this.idCard = idCard;
        this.course = course;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return String.format("String{name -> %s, idCard -> %s, Course -> %s}", super.getName(), idCard, course);
    }
}
