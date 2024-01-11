package model;

import java.time.LocalDate;
import java.util.Scanner;

public class HocSinh {
    private int maHS;
    private String tenHS;
    private LocalDate ngaySinh;

    public int getMaHS() {
        return maHS;
    }

    public void setMaHS(int maHS) {
        this.maHS = maHS;
    }

    public String getTenHS() {
        return tenHS;
    }

    public void setTenHS(String tenHS) {
        this.tenHS = tenHS;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    private Scanner sc = new Scanner(System.in);
    public HocSinh() {
        System.out.println("nhap ma hs");
        maHS = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten sv");
        tenHS = sc.nextLine();
        System.out.println("nhap ngay sinh");
        ngaySinh = LocalDate.parse(sc.nextLine());
    }
    public void inThongTin(){
        System.out.println(maHS + " co ten " + tenHS + " sinh ngay " + ngaySinh);
    }
}
