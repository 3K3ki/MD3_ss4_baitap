package Bai_tap_2;

public class StopWatch {
    private double start;
    private double end;

    public void start() {
        this.start = System.nanoTime();
    }

    public double getStart() {
        return start;
    }

    public void end() {
        this.end = System.nanoTime();
    }

    public double getEnd() {
        return end;
    }

    public void Stop() {
        double time = this.end - this.start;
        System.out.println("time: " + time);
    }
}
