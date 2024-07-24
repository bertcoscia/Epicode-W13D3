package ex2;

import java.util.Arrays;
import java.util.Random;

public class SIM {
    private String number;
    private double credit;
    private PhoneCall[] lastFiveCalls;

    public SIM(String number) {
        this.number = number;
        this.credit = 0;
        this.lastFiveCalls = new PhoneCall[5];
    }

    public PhoneCall callNumber(SIM calledNumber) {
        Random random = new Random();
        int duration = random.nextInt(1, 25);
        PhoneCall call = new PhoneCall(this.getNumber(), Integer.toString(duration), calledNumber.getNumber());
        PhoneCall[] newLastFiveCalls = new PhoneCall[5];
        for (int i = 0; i < 4; i++) {
            newLastFiveCalls[i] = this.lastFiveCalls[i + 1];
        }
        newLastFiveCalls[4] = call;
        setLastFiveCalls(newLastFiveCalls);
        return call;
    }


    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public PhoneCall[] getLastFiveCalls() {
        return lastFiveCalls;
    }

    public void setLastFiveCalls(PhoneCall[] lastFiveCalls) {
        this.lastFiveCalls = lastFiveCalls;
    }

    @Override
    public String toString() {
        return "SIM{" +
                "number='" + number + '\'' +
                ", credit=" + credit +
                ", lastFiveCalls=" + Arrays.toString(lastFiveCalls) +
                '}';
    }
}
