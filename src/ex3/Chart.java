package ex3;

import java.util.Arrays;

public class Chart {
    private User user;
    private Article[] articles;
    private double totalPrice;

    public Chart(User user) {
        this.user = user;
        this.articles = new Article[10];
        this.totalPrice = 0;
    }

    @Override
    public String toString() {
        return "Chart{" +
                "user=" + user +
                ", articles=" + Arrays.toString(articles) +
                ", totalPrice=" + totalPrice +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
