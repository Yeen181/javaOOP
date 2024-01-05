package oop_10;

import java.time.LocalDate;

public class Program {
    public static void main(String[] args) {
        Nguoi nguoi = new Nguoi();
        nguoi.inThongTin();
        Nguoi nguoi1 = new Nguoi(012,"nguyen van dinh a", LocalDate.parse("2003-12-12"));
        System.out.println(nguoi1.getHo() +"," + nguoi1.getDem()+"," + nguoi1.getTen());
    }
}
