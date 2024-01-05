package oop_08;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        HocSinh hs = new HocSinh();
        hs.inThongTin();
        HocSinh hs1 = new HocSinh("nguyen van a", "b20", LocalDate.parse("2002-12-03"),8.2,7.5,8.0);
        hs1.inThongTin();
    }
}
