package Modul4_Turunan;
import modul4.PublicModifier;
public class PublicModifierDemo2 {
    public static void main(String[] args){
    PublicModifier pubmod = new PublicModifier();
    System.out.println("---Different Package---");
    pubmod.kali();
    pubmod.tambah();
    pubmod.kurang();
    pubmod.bagi();
    pubmod.rata_rata();
    }
}
