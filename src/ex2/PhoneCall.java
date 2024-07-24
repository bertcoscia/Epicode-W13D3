package ex2;

import java.util.Random;

public class PhoneCall {
    private String id;
    private String caller;
    private String duration;
    private String calledNumber;

    public PhoneCall(String caller, String duration, String calledNumber) {
        Random random = new Random();
        int randomId = random.nextInt(1, 1500);
        this.id = Integer.toString(randomId);
        this.caller = caller;
        this.duration = duration;
        this.calledNumber = calledNumber;
    }

    @Override
    public String toString() {
        return "PhoneCall{" +
                "id='" + id + '\'' +
                ", caller='" + caller + '\'' +
                ", duration='" + duration + '\'' +
                ", calledNumber='" + calledNumber + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public String getCaller() {
        return caller;
    }

    public void setCaller(String caller) {
        this.caller = caller;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getCalledNumber() {
        return calledNumber;
    }

    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }
}
