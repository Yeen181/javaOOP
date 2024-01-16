package controller;

import lib.Input;
import model.Cat;
import model.LoaiCat;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CatController {
    List<Cat> danhSachMeo = new ArrayList<>();
    List<LoaiCat> danhSachLoai = new ArrayList<>();
    public void themMeo(){
        Scanner scanner = new Scanner(System.in);
        String tenMeo = Input.inputString("nhap ten");
        System.out.println("nhap tuoi: ");
        int tuoi = scanner.nextInt();
        scanner.nextLine();
        String gioiTinh = Input.inputString("gioi tinh: ");
        LoaiCat loaiCat = new LoaiCat();
        Cat cat = new Cat(tenMeo,tuoi,gioiTinh, loaiCat);
        danhSachMeo.add(cat);
    }
    public void xoaMeo(int id){
        danhSachMeo.removeIf(x-> x.getId()==id );
    }
    public void hienThiToanBoMeo(){
        for (Cat cat : danhSachMeo){
            cat.inThongTin();
        }
    }
    public void hienThiMeoTheoId(int id){
        for (Cat cat : danhSachMeo){
            if (cat.getId() == id){
                cat.inThongTin();
            }
        }
    }
    public void thaydoiKeu(int id){
        for (Cat cat : danhSachMeo){
            if (cat.getId() == id){
                for (LoaiCat loaiCat : danhSachLoai){
                    loaiCat.setTiengKeu(Input.inputString("nhap tieng keu moi: "));
                    System.out.println("tieng keu moi: " + loaiCat.getTiengKeu());
                }
            }
        }
    }
}
