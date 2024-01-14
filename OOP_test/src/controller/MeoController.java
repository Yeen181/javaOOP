package controller;

import model.Meo;
import model.TiengKeu;
import model.TiengKeuMeoLongDai;

import java.util.ArrayList;
import java.util.List;

public class MeoController {
    private List<Meo> lstMeo = new ArrayList<>();
    public void themMeo(Meo meo){
        lstMeo.add(meo);
    }
    public void xoaMeoTheoID(int id) {
        Meo meoCanXoa = null;
        for (Meo meo : lstMeo) {
            if (meo.getId() == id) {
                meoCanXoa = meo;
                break;
            }
        }

        if (meoCanXoa != null) {
            lstMeo.remove(meoCanXoa);
            System.out.println("Mèo có ID " + id + " đã được xóa.");
        } else {
            System.out.println("Không tìm thấy mèo có ID " + id + " trong danh sách.");
        }
    }

    public void hienThiToanBoMeo() {
        for (Meo meo : lstMeo) {
            meo.hienThiThongTin();
        }
    }

    public void hienThiMeoTheoID(int id) {
        for (Meo meo : lstMeo){
            if (meo.getId() == id){
                meo.hienThiThongTin();
            }
        }

    }

    public void thayDoiTiengKeuTheoID(int id, TiengKeu tiengKeu) {
        Meo meoThayDoi = null;
        for (Meo meo : lstMeo){
            if (meo.getId() == id){
                meoThayDoi = meo;
                break;
            }
        }
        if (meoThayDoi != null){
            meoThayDoi.setTiengKeu(tiengKeu);
            System.out.println("tieng meo cua meo co id " + id + " da duoc thay doi");
        }
        else {
            System.out.println("khong tim thay meo can thay doi");
        }
    }
}


