package oop_19;

public class KiemSi extends BinhLinh{
    public KiemSi(String ten, int sucManh, boolean trangBi) {
        super(ten, sucManh, trangBi);
    }

    protected double tinhSucManh(){
        if (trangBi == true) {
            return sucManh *= 1.7;
        }
        else return sucManh;
    }
}
