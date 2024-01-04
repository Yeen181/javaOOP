package oop_14;

public class Program {
    public static void main(String[] args) {
        PhanSo ps = new PhanSo(18,20);
        ps.InThongTin();
        ps.Cong(new PhanSo(2,4)).InThongTin();
        ps.Tru(new PhanSo(1,8)).InThongTin();
    }
}
