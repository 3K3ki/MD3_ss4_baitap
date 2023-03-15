package Bai_tap_2;

public class Main {
    public static void main(String[] args) {
        StopWatch clock = new StopWatch();
        clock.start();
        System.out.println(clock.getStart());
        clock.end();
        System.out.println(clock.getEnd());
        clock.Stop();
    }
}
