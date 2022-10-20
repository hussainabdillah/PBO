package Modul2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        System.out.println("\n" + "---Data Mahasiswa---");
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.tampilkanNama("Hussain Abdillah Tugas Kelarno");
        mahasiswa.tampilkanNim("L200214201");
        mahasiswa.tampilkanAlamat("Nandan, Bendosari, Sukoharjo");
        mahasiswa.tampilkanSemester(3);
        mahasiswa.printInfo();
    }
}
