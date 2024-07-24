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
        return description + " = {" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", numAvailable=" + numAvailable +
                '}';
    }

    public void addToChart(Chart chart) {
        Article[] newArticles = new Article[2];
        for (int i = 0; i < 1; i++) {
            newArticles[i] = chart.getArticles()[i + 1];
        }
        newArticles[1] = this;
        chart.setArticles(newArticles);
        chart.setTotalPrice(chart.getTotalPrice() + this.price);
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
