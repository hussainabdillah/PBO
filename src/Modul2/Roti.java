package Modul2;

public class Roti {
    String warna;
    String rasa;
    String merk;
    int berat;
    double harga;
    

    void beriWarna(String warnaRoti){
        warna = warnaRoti;
    }

    void beriRasa(String rasaRoti){
        rasa = rasaRoti;
    }

    void beriMerk(String merkRoti){
        merk = merkRoti;
    }
    void timbangBerat(int beratRoti){
        berat = beratRoti;
    }

    void hargaJual(double hargaRoti) {
        harga = hargaRoti;
    }

    
    void infoRoti() {
        System.out.println(
            "Warna Roti : " + warna + "\n" +
            "Rasa Roti : " + rasa + "\n" +
            "Merk Roti : " + merk + "\n"+
            "Berat Roti : " + berat + " gr \n"+          

            "Harga Roti : Rp. " + harga);
    }
      
}

