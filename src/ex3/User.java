package ex3;

import java.util.Random;

public class User {
    private int userId;
    private String name;
    private String surname;
    private String email;
    private String subscriptionDate;

    public User(String name, String surname, String email) {
        Random random = new Random();
        this.userId = random.nextInt(1, 100);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.subscriptionDate = "2024-07-24";
    }

    @Override
    public String toString() {
        return name + " " + surname + " {" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", subscriptionDate='" + subscriptionDate + '\'' +
                '}';
    }

    public Chart createChart() {
        return new Chart(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
