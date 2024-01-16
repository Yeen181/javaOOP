package lib;

import view.CatView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CatView view = new CatView();
        Scanner sc = new Scanner(System.in);
        while (true){
            view.menu();
            int choose = sc.nextInt();
            view.thucThi(choose);
        }
    }
}
