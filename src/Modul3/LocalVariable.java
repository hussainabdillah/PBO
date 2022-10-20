package Modul3;

public class LocalVariable {
    int usia ;
    
    public void hitungUsia(){
    int tahunSekarang = 2022;
    int tahunLahir = 2002;
   
    
    usia = tahunSekarang - tahunLahir;
    
        System.out.println("Usia saya: " + usia);
    }
    
    void beratBadan(){
    int beratLahir = 2;
    
    int beratBadan = beratLahir + (usia/2);
    
        System.out.println("Berat: " + beratBadan);
    }
}
