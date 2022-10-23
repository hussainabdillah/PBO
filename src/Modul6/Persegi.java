package Modul6;

public class Persegi extends BangunDatar {
    double sisi = 2;

    @Override
    protected void hitungKeliling() {
        super.hitungKeliling();
        double keliling = (double) sisi * 4;
        System.out.println("keliling persegi: " + keliling);
    }

    @Override
    protected void hitungLuas() {
        super.hitungLuas();
        double luas = (double) sisi * sisi;
        System.out.println("luas persegi: " + luas);
    }
}
