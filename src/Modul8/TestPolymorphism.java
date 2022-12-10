package Modul8;

public class TestPolymorphism {
    public static void main(String[] args) {
    Kucing kucing = new Kucing();
    kucing.beriNama();
        System.out.println("Perilaku Kucing: " + kucing.perilaku());
        System.out.println("Suara Kucing: " + kucing.ngeong());
        System.out.println("===================================");
    Anjing anjing = new Anjing();
    anjing.beriNama();
        System.out.println("Perilaku Anjing: " + anjing.perilaku());
        System.out.println("Suara Anjing: " + anjing.menggonggong());
    }
}

