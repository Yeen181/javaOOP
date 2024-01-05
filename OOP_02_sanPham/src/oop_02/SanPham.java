package oop_02;

import java.util.Scanner;

public class SanPham {
    private int maSanPham;
    private String tenSanPham;
    private String loaiSanPham;
    private boolean laSanPhamMoi;

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
        laSanPhamMoi = isLaSanPhamMoi();
    }

    public String getLoaiSanPham() {
        return loaiSanPham;
    }

    public void setLoaiSanPham(String loaiSanPham) {
        this.loaiSanPham = loaiSanPham;
    }

    public boolean isLaSanPhamMoi() {
        return laSanPhamMoi;
    }

    public void setLaSanPhamMoi(boolean laSanPhamMoi) {
        this.laSanPhamMoi = laSanPhamMoi;
    }

    public SanPham(int maSanPham, String tenSanPham, String loaiSanPham, boolean laSanPhamMoi) {
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.loaiSanPham = loaiSanPham;
        this.laSanPhamMoi = laSanPhamMoi;
    }
    public void inThongTin(){
        System.out.println("San pham "+ tenSanPham+" co ma san pham "+ maSanPham+", thuoc loai "+ loaiSanPham +","+ laSanPhamMoi + " la san pham moi");
    }
}
