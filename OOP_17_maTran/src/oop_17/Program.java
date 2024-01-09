package oop_17;

public class Program {
    public static void main(String[] args) {
        MaTran mt = new MaTran();
        mt.inThongTin();
        MaTran mt1 = new MaTran();
        System.out.println("cong 2 ma tran");
        mt1.cong(mt).inThongTin();
    }
}
