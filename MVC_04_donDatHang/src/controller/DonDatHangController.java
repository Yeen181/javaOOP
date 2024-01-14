package controller;

import model.ChiTietDonDatHang;
import model.DonDatHang;
import model.Input;
import model.SanPham;

import java.util.ArrayList;
import java.util.List;

public class DonDatHangController {
    List<SanPham> lstSP = new ArrayList<>();
    List<DonDatHang> lstDonDatHang = new ArrayList<>();
    List<ChiTietDonDatHang> lstChiTiet = new ArrayList<>();
    public void themSanPham(){
        SanPham sp = new SanPham();
        lstSP.add(sp);
    }
    public void themDonDatHang(){
        DonDatHang donDatHang = new DonDatHang();
        lstDonDatHang.add(donDatHang);
    }
    public void themChiTietDonDatHang(ChiTietDonDatHang chiTietDonDatHang){
        int maSP = chiTietDonDatHang.getMaSP();
        int maDDh = chiTietDonDatHang.getMaDDH();
        boolean sanPhamTonTai = false;
        for (SanPham sp : lstSP){
            if (sp.getMaSP() == maSP){
                sanPhamTonTai = true;
                break;
            }
        }
        if (!sanPhamTonTai){
            System.out.println("San pham chua ton tai");
            boolean themMoi = Input.inputString("Ban muon them san pham moi khong ? (Y/N").equalsIgnoreCase("Y");
            if (themMoi){
                themSanPham();
            }else {
                return;
            }
        }
        boolean chiTietDDHTonTai = false;
        for (ChiTietDonDatHang ct : lstChiTiet){
            if (ct.getMaDDH() == maDDh && ct.getMaSP() == maSP){
                chiTietDDHTonTai = true;
                break;
            }
        }
        if (chiTietDDHTonTai){
            System.out.println("chi tiet don hang da ton tai");
            return;
        }
        lstChiTiet.add(chiTietDonDatHang);
    }
    public void hienThiDon(int maDDH){
        System.out.println("thon tin don dat hang ma DDH " + maDDH + ":" );
        for (DonDatHang donDatHang : lstDonDatHang){
            if (donDatHang.getMaDDh() == maDDH){
                donDatHang.inThongTin();
                System.out.println("chi tiet don dat hang");
                for (ChiTietDonDatHang ct : lstChiTiet){
                    if (ct.getMaDDH() == maDDH){
                        ct.inThongTin();
                    }
                }
            }
        }
    }
}
