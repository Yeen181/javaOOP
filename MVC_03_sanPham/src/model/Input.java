package model;

import java.util.Scanner;

public class Input {
    public static int inputInt(String msgNhap) {
        System.out.println(msgNhap);
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public static String inputString(String msgNhap) {
        System.out.println(msgNhap);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
