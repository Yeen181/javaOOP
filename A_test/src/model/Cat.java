package model;

import lib.Input;

import java.util.Scanner;

public class Cat {
    private int i = 1;
    private int id;
    private String tenMeo;
    private int tuoi;
    private String gioiTinh;
    private LoaiCat loai;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenMeo() {
        return tenMeo;
    }

    public void setTenMeo(String tenMeo) {
        this.tenMeo = tenMeo;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public LoaiCat getLoai() {
        return loai;
    }

    public void setLoai(LoaiCat loai) {
        this.loai = loai;
    }

    private Scanner sc =new Scanner(System.in);

    public Cat(String tenMeo, int tuoi, String gioiTinh, LoaiCat loaiCat) {
        this.id = i++;
        this.tenMeo = tenMeo;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.loai = loaiCat;
    }
    public void inThongTin(){
        System.out.println("id: " + getId());
        System.out.println("ten meo: " +getTenMeo());
        System.out.println("tuoi: " + getTuoi());
        System.out.println("gioi tinh: "+ getGioiTinh());
        System.out.println("Tieng keu: "  + loai.getTiengKeu());
    }
}
