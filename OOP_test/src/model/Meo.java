package model;

import java.util.Scanner;

public abstract class Meo {
    private int id;
    private String tenMeo;
    private int tuoi;
    private String gioiTinh;
    private TiengKeu tiengKeu;

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
    public void keu(){
        tiengKeu.keu();
    }
    public void setTiengKeu(TiengKeu tiengKeu){
        this.tiengKeu = tiengKeu;
    }
    private Scanner sc = new Scanner(System.in);
    public Meo() {
        System.out.println("nhap id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap ten meo: ");
        tenMeo = sc.nextLine();
        System.out.println("nhap tuoi meo: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.println("nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
    }
    public abstract void hienThiThongTin();
}
