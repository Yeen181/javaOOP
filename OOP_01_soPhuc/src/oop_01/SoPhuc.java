package oop_01;

import java.util.Scanner;

public class SoPhuc {
    private double phanThuc;
    private double phanAo;

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }

    public SoPhuc(double phanThuc, double phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }
    private Scanner sc = new Scanner(System.in);
    public SoPhuc() {
        System.out.println("nhap phan thuc: ");
        phanThuc = sc.nextDouble();
        System.out.println("nhap phan ao: ");
        phanAo = sc.nextDouble();
    }

    public void inThongTin(){
        System.out.println(phanThuc + phanAo);
    }
}
