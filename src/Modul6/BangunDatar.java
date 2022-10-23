package Modul6;
public class BangunDatar {
    protected double luas;
    protected double keliling;

    protected void hitungLuas(double panjang, double lebar) {
        luas = panjang * lebar;
    }

    protected double hitungKeliling(double panjang, double lebar) {
        keliling = 2 * (panjang + lebar);
        return keliling;
    }

}
