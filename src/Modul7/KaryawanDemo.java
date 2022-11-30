package Modul7;

public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        k1.setNama("Hussain");
        k1.setGaji(250000);
        k1.setUsia(20);

        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());

    }
}
