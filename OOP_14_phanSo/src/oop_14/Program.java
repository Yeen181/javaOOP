package oop_14;

public class Program {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo();
        ps.inThongTin();
        PhanSo ps1 = new PhanSo(18,20);
        ps1.cong(ps).inThongTin();
        ps1.tru(ps).inThongTin();
    }
}
