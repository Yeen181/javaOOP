package lib;

import java.util.Scanner;

public class Input {
    public static Scanner sc =new Scanner(System.in);
    public  static int inputInt(String msgNhap){
        System.out.println(msgNhap);
        return sc.nextInt();
    }
    public static String inputString(String msgNhap){
        System.out.println(msgNhap);
        return sc.nextLine();
    }
}
