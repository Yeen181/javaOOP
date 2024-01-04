package oop04;

public class Program {
    public static void main(String[] args) {
        SoThuc st1 = new SoThuc();
        System.out.println(st1.TinhCanBacN(3));
        SoThuc st2 = new SoThuc();
        SoThuc st3 = new SoThuc();
        System.out.println(SoThuc.TimMax(st1,st2,st3).getGiaTri());

    }
}
