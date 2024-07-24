package ex3;

import java.util.Random;

public class Article {
    private int id;
    private String description;
    private double price;
    private int numAvailable;

    public Article(String description, double price, int numAvailable) {
        Random random = new Random();
        this.id = random.nextInt(1, 100);
        this.description = description;
        this.price = price;
        this.numAvailable = numAvailable;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", numAvailable=" + numAvailable +
                '}';
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumAvailable() {
        return numAvailable;
    }

    public void setNumAvailable(int numAvailable) {
        this.numAvailable = numAvailable;
    }
}
