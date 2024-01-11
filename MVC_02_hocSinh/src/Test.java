import view.Menu;

public class Test {
    public static void main(String[] args) {
        Menu mn = new Menu();
        while (true){
            mn.menu();
            char choose = mn.sc.next().charAt(0);
            mn.thucThi(choose);
        }
    }
}
