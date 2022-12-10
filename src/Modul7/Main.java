package Modul7;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------------Manager--------------------");
        Manager m1 = new Manager();
        m1.setGajiManager(2000000);
        m1.setNama("Hussain");
        m1.setUsia(30);
        m1.setjamKerja(8.5f);
        System.out.println("Nama Manager : " + m1.getNama());
        System.out.println("Usia Manager : " + m1.getUsia());
        System.out.println("Gaji Manager : " + m1.getGajiManager());
        System.out.println("Jam Kerja Manager : " + m1.getjamKerja() + "\n");

        Manager m2 = new Manager();
        m2.setGajiManager(2500000);
        m2.setNama("Ilhan");
        m2.setUsia(29);
        m2.setjamKerja(8.5f);
        System.out.println("Nama Manager : " + m2.getNama());
        System.out.println("Usia Manager : " + m2.getUsia());
        System.out.println("Gaji Manager : " + m2.getGajiManager());
        System.out.println("Jam Kerja Manager : " + m2.getjamKerja());

        System.out.println("--------------------Karyawan--------------------");
        Karyawan k1 = new Karyawan();
        k1.setGaji(1000000);
        k1.setNama("Yanfei");
        k1.setUsia(25);
        System.out.println("Nama Karyawan : " + k1.getNama());
        System.out.println("Usia Karyawan : " + k1.getUsia());
        System.out.println("Gaji Karyawan : " + k1.getGaji() + "\n");

        Karyawan k2 = new Karyawan();
        k2.setGaji(1500000);
        k2.setNama("HuTao");
        k2.setUsia(27);
        System.out.println("Nama Karyawan : " + k2.getNama());
        System.out.println("Usia Karyawan : " + k2.getUsia());
        System.out.println("Gaji Karyawan : " + k2.getGaji() + "\n");

        Karyawan k3 = new Karyawan();
        k3.setGaji(2000000);
        k3.setNama("Lumine");
        k3.setUsia(28);
        System.out.println("Nama Karyawan : " + k3.getNama());
        System.out.println("Usia Karyawan : " + k3.getUsia());
        System.out.println("Gaji Karyawan : " + k3.getGaji());


    }
}