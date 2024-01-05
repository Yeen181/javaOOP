package oop_09;

import java.util.Scanner;

public class Point3D {
    private double x;
    private double y;
    private double z;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public Point3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    private Scanner sc = new Scanner(System.in);
    public Point3D() {
        System.out.println("nhap x");
        x = sc.nextDouble();
        System.out.println("nhap y");
        y =sc.nextDouble();
        System.out.println("nhap z");
        z = sc.nextDouble();
    }
    public void inThongTin(){
        System.out.println("(" + x + "," + y + ","+ z + ")");
    }
    public void tinhKhoangCach(Point3D diem1, Point3D diem2){
        double x = Math.pow(diem1.getX()-diem2.getX(),2);
        double y = Math.pow(diem1.getY()-diem2.getY(),2);
        double z = Math.pow(diem1.getZ()-diem2.getZ(),2);
        double kc = Math.pow(x+y+z,1./3);
        System.out.println("khoang cach: "+ kc);
    }
}
