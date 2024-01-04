package oop_12;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        HocVien hv = new HocVien();
        hv.InThongTin();
        List<HocVien> lst = new ArrayList<>();
        lst.add(hv);
        lst.add(new HocVien());
        lst.add(new HocVien());
        lst.add(new HocVien());
        List<HocVien> list = HocVien.TimKiemHocVien(lst);
        for (HocVien i : list){
            i.InThongTin();
        }
    }
}
