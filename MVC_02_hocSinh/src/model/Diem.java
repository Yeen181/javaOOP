package model;

import java.util.Scanner;

public class Diem {
    private int maHS;
    private int maMH;
    private double diem;

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public int getMaMH() {
        return maMH;
    }

    public void setMaMH(int maMH) {
        this.maMH = maMH;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public Diem(int maHS, int maMH, double diem) {
        this.maHS = maHS;
        this.maMH = maMH;
        this.diem = diem;
    }

    private Scanner sc = new Scanner(System.in);
    public Diem() {
        System.out.println("nhap ma hoc sinh ");
        maHS = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ma mon hoc");
        maMH = sc.nextInt();
        diem = nhapDiem();
    }
    public double nhapDiem(){
        boolean check = false;
        double n = 0;
        while (!check){
            try{
                System.out.println("nhap diem");
                n = sc.nextDouble();
                if ((n <0 || n >10) && n % 0.25 != 0) check = false;
                else check = true;
            }
            catch (Exception e){
                System.out.println("vui long nhap lai so diem trong khoang [0,10] va chia het cho 0.25" );
                sc.nextLine();
            }
        }
        return n;
    }
    public void inThongTin(){
        System.out.println("ma hoc sinh: " + maHS);
        System.out.println("ma mon hoc: " + maMH);
        System.out.println("diem: " + diem);
    }
}
