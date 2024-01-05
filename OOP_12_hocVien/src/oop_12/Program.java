package oop_12;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        HocVien hv = new HocVien();
        hv.inThongTin();
        List<HocVien> lst = new ArrayList<>();
        lst.add(hv);
        lst.add(new HocVien());
        lst.add(new HocVien());
        lst.add(new HocVien());
        List<HocVien> list = HocVien.timKiemHocVien(lst);
        for (HocVien i : list){
            i.inThongTin();
        }
    }
}
