package oop_20;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Sach> lst = new ArrayList<>();
        Sach sach = new Sach();
        sach.nhapSach();
        lst.add(sach);
        Sach sach1 = new Sach();
        sach1.nhapSach();
        lst.add(sach1);
        Sach sach2 = new Sach();
        sach2.nhapSach();
        lst.add(sach2);
        //lst.forEach(x->x.inSach());
        Sach.timKiemSach(lst, "toan").forEach(x->x.inSach());
    }
}
