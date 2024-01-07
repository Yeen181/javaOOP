package oop_19;

public class CungThu extends BinhLinh{
    public CungThu(String ten, int sucManh, boolean trangBi) {
        super(ten, sucManh, trangBi);
    }

    protected double tinhSucManh(){
        if (trangBi == true) {
            return sucManh *= 1.3;
        }
        else return sucManh;
    }
}
