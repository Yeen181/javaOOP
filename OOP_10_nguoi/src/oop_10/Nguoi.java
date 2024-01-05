package oop_10;

import javax.swing.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Nguoi {
    private int maSo;
    private String hoTen;
    private LocalDate ngaySinh;
    private String ho;
    private String dem;
    private String ten;

    public int getMaSo() {
        return maSo;
    }

    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public Nguoi(int maSo, String ht, LocalDate ngaySinh) {
        this.maSo = maSo;
        this.hoTen = taoDuLieuHoTen(ht);
        this.ngaySinh = ngaySinh;
    }

    public String getHo() {
        setHoDemTen();
        return ho;
    }

    public String getDem() {
        setHoDemTen();
        return dem;
    }

    public String getTen() {
        setHoDemTen();
        return ten;
    }
    public void setHoDemTen(){
        String [] arr = hoTen.split(" ");
        ho = arr[0];
        ten = arr[arr.length-1];
        dem = "";
        for (int i = 1; i < arr.length -1; i++){
            if(i < arr.length - 2) dem += arr[i] + " ";
            else dem += arr[i];
        }
    }
    public String taoDuLieuHoTen(String ht){
        if(hoTen == null || ht.compareTo(hoTen) != 0) return ht;
        return hoTen;
    }
    private Scanner sc = new Scanner(System.in);
    public Nguoi(){
        System.out.println("nhap ma so: ");
        maSo = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ho ten: ");
        hoTen = taoDuLieuHoTen(sc.nextLine());
        System.out.println("nhap ngay sinh: ");
        ngaySinh = LocalDate.parse(sc.nextLine());
    }
    public void inThongTin(){

        System.out.println(maSo+" co ten la " + hoTen + " sinh ngay " + ngaySinh);
    }
}
