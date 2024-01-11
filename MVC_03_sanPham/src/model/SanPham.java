package model;

import java.util.List;

public class SanPham {
    private int maSP;
    private LoaiSanPham loaiSP;
    private NhaCungCap nhaCC;
    private String tenSP;

    public int getMaSP() {
        return maSP;
    }

    public void setMaSP(int maSP) {
        this.maSP = maSP;
    }

    public LoaiSanPham getLoaiSP() {
        return loaiSP;
    }

    public void setLoaiSP(LoaiSanPham loaiSP) {
        this.loaiSP = loaiSP;
    }

    public NhaCungCap getNhaCC() {
        return nhaCC;
    }

    public void setNhaCC(NhaCungCap nhaCC) {
        this.nhaCC = nhaCC;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public SanPham(List<LoaiSanPham> loaiSanPhamList, List<NhaCungCap> nhaCungCapList) {
        maSP = Input.inputInt("nhap ma san pham");
        int chonLoaiSP = chonLoaiSP(loaiSanPhamList);
        if (chonLoaiSP == -1){
            loaiSP = null;
        }else {
            loaiSP = loaiSanPhamList.get(chonLoaiSP);
        }
        int chonNhaCC = chonNhaCC(nhaCungCapList);
        if (chonNhaCC == -1) {
            nhaCC = null;
        }
        else {
            nhaCC = nhaCungCapList.get(chonNhaCC);
        }
        tenSP = Input.inputString("nhap ten san pham");
    }
    private int chonLoaiSP(List<LoaiSanPham> loaiSanPhamList){
        System.out.println("chon loai san pham: ");
        for (int i = 0; i < loaiSanPhamList.size(); i++){
            System.out.println(i + 1);
            loaiSanPhamList.get(i).inThongTin();
        }
        return Input.inputInt("chon:") -1;
    }
    private int chonNhaCC(List<NhaCungCap> nhaCungCapList){
        System.out.println("chon nha cung cap");
        for (int i = 0; i < nhaCungCapList.size(); i++){
            System.out.println(i +1);
            nhaCungCapList.get(i).inThongTin();
        }
        return Input.inputInt("chon: ") -1;
    }
    public void inThongTin() {
        System.out.println("Ma SP: " + maSP);
        System.out.println("Loai SP: " );
        loaiSP.inThongTin();
        System.out.println("Nha CC: " );
        nhaCC.inThongTin();
        System.out.println("Ten SP: " + tenSP);
    }
}
