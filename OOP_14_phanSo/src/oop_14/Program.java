package oop_14;

public class Program {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo();
        ps.InThongTin();
        PhanSo ps1 = new PhanSo(18,20);
        ps1.Cong(ps).InThongTin();
        ps1.Tru(ps).InThongTin();
    }
}
