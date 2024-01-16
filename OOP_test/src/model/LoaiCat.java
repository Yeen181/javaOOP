package model;

import lib.Input;

public class LoaiCat {
    private String tenLoai;
    private String tiengKeu;

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public String getTiengKeu() {
        return tiengKeu;
    }

    public void setTiengKeu(String tiengKeu) {
        this.tiengKeu = tiengKeu;
    }

    public LoaiCat() {
        setTenLoai(Input.inputString("nhap ten loai: "));
        setTiengKeu(Input.inputString("nhap tieng keu:"));
    }

    public LoaiCat(String tenLoai, String tiengKeu) {
        this.tenLoai = tenLoai;
        this.tiengKeu = tiengKeu;
    }
}
