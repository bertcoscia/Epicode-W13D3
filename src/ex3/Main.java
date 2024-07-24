package ex3;

public class Main {
    public static void main(String[] args) {
        Article art1 = new Article("iPhone", 150, 15);
        System.out.println(art1);
        /*Article art2 = new Article("iPad", 100, 5);
        System.out.println(art2);*/

        User user1 = new User("A. Alberto", "Coscia", "angeloalberto.coscia@gmail.com");
        System.out.println(user1);
        /*User user2 = new User("Sergio", "Mattarella", "sergio@mattarella.it");
        System.out.println(user2);*/

        Chart user1Chart = user1.createChart();
        System.out.println(user1Chart);

    }
}
