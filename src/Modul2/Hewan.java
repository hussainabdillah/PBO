package Modul2;

public class Hewan {
    String nama;
    int kaki;
    String makanan;
    String tipe;
    
    void beriNama(String namaHewan){
        nama = namaHewan;
    }
    
    void kakinyaBerapa(int jumlahKaki){
        kaki = jumlahKaki;
    }
    
    void makannnyaApa(String jenisMakanan){
        makanan = jenisMakanan;
    }
    
    void hewanTipeApa(String tipeHewan){
        tipe = tipeHewan;
    }
    
    void printInfo(){
        System.out.println("Nama Hewan : " + nama + "\n" +
            "Jumlah Kaki : " + kaki + "\n" +
            "Makanan : " + makanan + "\n"+
            "Type Hewan : " + tipe + "\n");
    }
}
