package Modul2;

public class HewanDemo {
    public static void main(String[] args) {
        System.out.println("\n" + "---Hewan 1---");
        Hewan hewan1 = new Hewan();
        hewan1.beriNama("Harimau");
        hewan1.kakinyaBerapa(4);
        hewan1.makannnyaApa("Daging");
        hewan1.hewanTipeApa("Karnivora");
        hewan1.printInfo();
        
        System.out.println("\n" + "---Hewan 2---");
        Hewan hewan2 = new Hewan();
        hewan2.beriNama("Kerbau");
        hewan2.kakinyaBerapa(4);
        hewan2.makannnyaApa("Rumput");
        hewan2.hewanTipeApa("Herbivora");
        hewan2.printInfo();
    }
}
