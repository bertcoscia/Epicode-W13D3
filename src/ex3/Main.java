package ex3;

public class Main {
    public static void main(String[] args) {
        Article art1 = new Article("iPhone", 150, 15);
        Article art2 = new Article("iPad", 100, 5);

        User user1 = new User("A. Alberto", "Coscia", "angeloalberto.coscia@gmail.com");
        User user2 = new User("Sergio", "Mattarella", "sergio@mattarella.it");
        User user3 = new User("Linus", "Torvalds", "linus@linux.fi");

        Chart user1Chart = user1.createChart();
        System.out.println(user1Chart);

        art1.addToChart(user1Chart);
        System.out.println(user1Chart);

        Chart user2Chart = user2.createChart();
        System.out.println(user2Chart);

        art2.addToChart(user2Chart);
        System.out.println(user2Chart);

        Chart user3Chart = user3.createChart();
        art1.addToChart(user3Chart);
        art2.addToChart(user3Chart);
        System.out.println(user3Chart);
    }
}
