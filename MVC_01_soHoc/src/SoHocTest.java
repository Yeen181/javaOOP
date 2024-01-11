import view.SoHocView;

import java.util.Scanner;

public class SoHocTest {
    public static void main(String[] args) {
        SoHocView view = new SoHocView();
        while (true){
            view.menu();
            char choose = view.sc.next().charAt(0);
            view.thucThi(choose);
        }
    }
}
