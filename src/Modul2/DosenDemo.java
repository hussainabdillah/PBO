package Modul2;

public class DosenDemo {
    public static void main(String[] args){
        System.out.println("\n" + "---Data Dosen---");
        Dosen dosen = new Dosen();
        dosen.tampilkanNama("Sir Alex Ferguson");
        dosen.tampilkanTglLahir("31 Desember 1941");
        dosen.tampilkanNik(505);
        dosen.printInfo();
    }
}
