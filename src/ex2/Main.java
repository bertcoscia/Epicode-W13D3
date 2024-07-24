package ex2;

public class Main {
    public static void main(String[] args) {

        SIM sim1 = new SIM("1111111111");
        SIM sim2 = new SIM("2222222222");
        System.out.println(sim1);
        System.out.println(sim2);

        sim1.setCredit(5.95);
        System.out.println(sim1);

        sim1.callNumber(sim2);
        sim1.callNumber(sim2);
        sim1.callNumber(sim2);
        sim1.callNumber(sim2);
        sim1.callNumber(sim2);

        System.out.println(sim1);
    }
}
