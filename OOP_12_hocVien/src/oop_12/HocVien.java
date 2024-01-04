package oop_12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HocVien {
    private int maHocVien;
    private String hoTen;
    private LocalDate ngaySinh;
    private String ho;
    private double hocPhi;
    private String email;

    public int getMaHocVien() {
        return maHocVien;
    }

    public void setMaHocVien(int maHocVien) {
        this.maHocVien = maHocVien;
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

    public String getHo() {
        setHo(hoTen);
        return ho;
    }

    public void setHo(String ho) {
        ho = hoTen.split(" ")[0];
    }

    public double getHocPhi() {
        setHocPhi(hocPhi);
        return hocPhi;
    }

    public void setHocPhi(double hocPhi) {
        if(hocPhi > 3000000) this.hocPhi = hocPhi*0.95;
        else this.hocPhi = hocPhi;
    }

    public String getEmail() {
        setEmail();
        return email;
    }

    private void setEmail() {
        String [] arr = hoTen.split(" ");
        email = arr[arr.length - 1].toLowerCase() + "@edusolution.com";
    }

    public HocVien(int maHocVien, String hoTen, LocalDate ngaySinh) {
        this.maHocVien = maHocVien;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }
    private Scanner sc = new Scanner(System.in);
    public HocVien(){
        maHocVien = sc.nextInt();
        sc.nextLine();
        hoTen = sc.nextLine();
        ngaySinh = LocalDate.parse(sc.nextLine());
        hocPhi = sc.nextDouble();
    }
    public static List<HocVien> TimKiemHocVien(List<HocVien> lst){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten can tim");
        String str = sc.nextLine();
        List<HocVien> list = new ArrayList<>();
        for (HocVien i : lst){
            if (i.getHoTen().contains(str)) list.add(i);
        }
        return list;
    }
    public void InThongTin(){
        System.out.println(maHocVien + " co ten "+ hoTen+ " co email " + getEmail() + " hoc phi "+ getHocPhi());
    }
}
