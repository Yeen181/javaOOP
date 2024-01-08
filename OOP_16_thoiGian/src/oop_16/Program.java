package oop_16;

public class Program {
    public static void main(String[] args) {
        ThoiGian thoiGian = new ThoiGian();
        thoiGian.inThongTin();
        ThoiGian thoiGian1 = new ThoiGian(2023,12,29);
        thoiGian1.inThongTin();
        System.out.println("khoang cach: " + thoiGian.layKhoangThoiGian(thoiGian1));
    }
}
