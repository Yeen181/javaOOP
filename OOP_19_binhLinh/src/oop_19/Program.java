package oop_19;

public class Program {
    public static void main(String[] args) {
        BinhLinh bl = new BinhLinh("kiem", 20, true);
        bl.inThongTin();
        BinhLinh bl1 = new BinhLinh("linh", 20, false);
        bl1.chienDau(bl);
        CungThu ct = new CungThu("khien", 20,true);
        ct.inThongTin();
        CungThu ct1 = new CungThu("cung", 50,false);
        DauSi ds = new DauSi("fb",25,false);
        ds.inThongTin();
        KiemSi ks = new KiemSi("kiem",21,true);
        ks.inThongTin();
    }
}
