package Bai_tap_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập trạng thái: ");
        boolean status = scanner.nextBoolean();
        System.out.println("Nập quãng đường : ");
        double line = scanner.nextDouble();
        System.out.println("Nhập tốc độ:");
        int speed = scanner.nextInt();
        System.out.println("Nhập loại: ");
        String model = scanner.nextLine();
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        Oto oto = new Oto(speed, status,line,model,name);
        oto.setLine();
        oto.setStatus();
        oto.setSpeed();
    }
}
