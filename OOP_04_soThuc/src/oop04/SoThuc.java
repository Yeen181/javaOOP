package oop04;

import java.util.Map;
import java.util.Scanner;

public class SoThuc {
    private double giaTri;
    private boolean laSoDuong;

    public double getGiaTri() {
        return giaTri;
    }

    public void setGiaTri(double giaTri) {
        this.giaTri = giaTri;
    }

    public boolean isLaSoDuong() {
        return laSoDuong;
    }

    public void setLaSoDuong(boolean laSoDuong) {
        this.laSoDuong = laSoDuong;
    }
    public SoThuc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap gia tri: ");
        giaTri = sc.nextDouble();
    }
    public static SoThuc TimMax(SoThuc a, SoThuc b, SoThuc c){
        if (a.getGiaTri() >= b.getGiaTri() && a.getGiaTri() >= c.getGiaTri()) return a;
        if (b.getGiaTri() >= a.getGiaTri() && b.getGiaTri() >= c.getGiaTri()) return b;
        return c;
    }
    public double TinhCanBacN(int n){
        return Math.pow(giaTri, 1./n);
    }
}
