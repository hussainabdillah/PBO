package Modul8;
import java.util.Scanner;

public class Pet {
    private String nama;
//method beriNama menggunakan scanner
    public void beriNama() {
        Scanner input = new Scanner(System.in);
        String nama;
        System.out.print("Masukkan nama hewan: ");
        nama = input.nextLine();
        System.out.println("Nama hewan: " + nama);
    }
    public String panggilNama() {
        return this.nama;
    }
    public String perilaku(){
        return "Hewan Penurut";
    }
    public void makan(){
        System.out.println("Hewan Makan");
    }
    public void jalan(){
        System.out.println("Hewan Berjalan");
    }
}
