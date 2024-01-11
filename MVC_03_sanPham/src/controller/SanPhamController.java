package controller;

import model.Input;
import model.LoaiSanPham;
import model.NhaCungCap;
import model.SanPham;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SanPhamController {
   public List<SanPham> lstSP = new ArrayList<>();
    public List<NhaCungCap> lstNCC = new ArrayList<>();
    public List<LoaiSanPham> lstLoaiSP = new ArrayList<>();
    public void themNCC(){
        NhaCungCap nhaCungCap = new NhaCungCap();
        lstNCC.add(nhaCungCap);
    }
    public void themLoaiSP(){
        LoaiSanPham loaiSanPham = new LoaiSanPham();
        lstLoaiSP.add(loaiSanPham);
    }
    public void themSP(){
        SanPham sp = new SanPham(lstLoaiSP,lstNCC);
        int loaiSP = kiemTraLoaiSP(sp.getLoaiSP());
        int nhaCC = kiemTraNhaCC(sp.getNhaCC());

        if (loaiSP == -1) {
            System.out.println("Loai SP chua ton tai.");
            boolean themMoi = Input.inputString("Ban muon them moi Loai SP? (Y/N): ").equalsIgnoreCase("Y");
            if (themMoi) {
                themLoaiSP();
                loaiSP = lstLoaiSP.size() - 1;
            } else {
                return;
            }
        }

        if (nhaCC == -1) {
            System.out.println("Nha CC chua ton tai.");
            boolean themMoi = Input.inputString("Ban muon them moi Nha CC? (Y/N): ").equalsIgnoreCase("Y");
            if (themMoi) {
                themNCC();
                nhaCC = lstNCC.size() - 1;
            } else {
                return;
            }
        }

        sp.setLoaiSP(lstLoaiSP.get(loaiSP)) ;
        sp.setNhaCC(lstNCC.get(nhaCC));
        lstSP.add(sp);
    }
    private int kiemTraLoaiSP(LoaiSanPham loaiSP) {
        for (int i = 0; i < lstLoaiSP.size(); i++) {
            if (lstLoaiSP.get(i).equals(loaiSP)) {
                return i;
            }
        }
        return -1;
    }
    private int kiemTraNhaCC(NhaCungCap nhaCC) {
        for (int i = 0; i < lstNCC.size(); i++) {
            if (lstNCC.get(i).equals(nhaCC)) {
                return i;
            }
        }
        return -1;
    }
    private Scanner sc = new Scanner(System.in);
    public void hienLoai(){
        System.out.println("nhap loai: ");
        int loaiSP = sc.nextInt();
        List<SanPham> listLoai = new ArrayList<>();
        for (SanPham sp : lstSP){
            if (loaiSP == sp.getLoaiSP().getLoaiSP()){
                listLoai.add(sp);
            }
        }
        for (SanPham sp : listLoai){
            sp.inThongTin();
        }
    }
    public void errorTypeHienNCC(){
        System.out.println("nhap nha cung cap");
        int nhaCC = sc.nextInt();
        List<SanPham> listNCC = new ArrayList<>();
        for (SanPham sp : lstSP){
            if (sp.getNhaCC().getNhaCC() == nhaCC){
                listNCC.add(sp);
            }
        }
        for (SanPham sp : listNCC){
            sp.inThongTin();
        }
    }
}
