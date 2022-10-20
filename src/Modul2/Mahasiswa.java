package Modul2;

public class Mahasiswa {
    String nama;
    String nim;
    String alamat;
    int semester;
    
    void tampilkanNama(String namaMahasiwa){
        nama = namaMahasiwa;
    }
    
    void tampilkanNim(String nimMahasiswa){
        nim = nimMahasiswa;
    }
    
    void tampilkanAlamat(String alamatMahasiswa){
        alamat = alamatMahasiswa;
    }
    
    void tampilkanSemester(int semesterMahasiswa){
        semester = semesterMahasiswa;
    }
    
    void printInfo(){
        System.out.println(
            "Nama Mahasiswa : " + nama + "\n" +
            "NIM : " + nim + "\n" +
            "Alamat : " + alamat + "\n" +
            "Semester : " + semester +"\n");
    }
    
}
