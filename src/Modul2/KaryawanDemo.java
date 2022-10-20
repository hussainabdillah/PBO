package Modul2;

public class KaryawanDemo {
    public static void main(String[] args) {
        System.out.println("\n" + "---Data Karyawan---");
        Karyawan karyawan = new Karyawan();
        karyawan.tampilkanNama("Bill Gates");
        karyawan.tampilkanJabatan("Chief Executive Officer");
        karyawan.tampilkanAlamat("Redmond, Washington, United States");
        karyawan.tampilkanGaji(1000000);
        karyawan.printInfo();
        
    }
}
