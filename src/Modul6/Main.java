package Modul6;

public class Main {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println(mobil.tipePenggerak);
        System.out.println(mobil.gear);
        System.out.println(mobil.namaBahanBakar);
        System.out.println(mobil.horsePower);
        System.out.println();
        Pesawat pesawat = new Pesawat();
        System.out.println(pesawat.tipePenggerak);
        System.out.println(pesawat.namaKendaraan);
        System.out.println(pesawat.namaBahanBakar);
        System.out.println(pesawat.horsePower);

    }
}
