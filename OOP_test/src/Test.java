
import view.MeoView;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MeoView view = new MeoView();
        while (true){
            view.menu();
            Scanner sc = new Scanner(System.in);
            char choose = sc.next().charAt(0);
            view.thucThi(choose);
        }
    }
}
