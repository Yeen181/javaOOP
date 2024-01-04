package oop_06;

import java.util.Scanner;

public class LopHoc {
    private int maLop;
    private String tenLop;
    private int siSo;
    private String diaChi;
    private String gvcn;

    public int getMaLop() {
        return maLop;
    }

    public void setMaLop(int maLop) {
        this.maLop = maLop;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public int getSiSo() {
        return siSo;
    }

    public void setSiSo(int siSo) {
        this.siSo = siSo;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getGvcn() {
        return gvcn;
    }
    public void setGvcn(String gvcn) {
        this.gvcn = gvcn;
    }

    public LopHoc(int maLop, String tenLop, int siSo, String diaChi, String gvcn) {
        this.maLop = maLop;
        this.tenLop = tenLop;
        this.siSo = siSo;
        this.diaChi = diaChi;
        this.gvcn = gvcn;
    }
    public LopHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma lop: ");
        maLop = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten lop: ");
        tenLop = sc.nextLine();
        System.out.println("nhap si so: ");
        siSo = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("nhap gvcn: ");
        gvcn = sc.nextLine();
    }
    public void InThongTin(){
        System.out.println("Lop " + tenLop + " co ma la " + maLop + " o "+ diaChi + "." +
                "Lop co "+ siSo + " hoc sinh va co "+ gvcn + " la giao vien chu nhiem");
    }
}
