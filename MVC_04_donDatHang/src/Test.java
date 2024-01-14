import view.DonDatHangView;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        DonDatHangView view = new DonDatHangView();
        Scanner sc = new Scanner(System.in);
        while (true){
            view.menu();
            char choose = sc.next().charAt(0);
            view.thucThi(choose);
        }
    }
}
