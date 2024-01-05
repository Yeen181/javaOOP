package oop_11;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        DonDatHang hang = new DonDatHang();
        hang.inthongTin();
        DonDatHang hang1 = new DonDatHang(01, LocalDate.parse("2023-12-12"),"vong tay",120000,2,"size S");
        hang1.inthongTin();
    }
}
