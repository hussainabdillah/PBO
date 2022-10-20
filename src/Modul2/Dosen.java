package Modul2;

public class Dosen {
    String nama;
    int nik;
    String pendidikan = "Manchester Metropolitan University";
    String tglLahir;
    
    void tampilkanNama(String namaDosen){
        nama = namaDosen;
    }
    
    void tampilkanTglLahir(String dosenBirthday){
        tglLahir = dosenBirthday;
    }
    
    void tampilkanNik(int nikDosen){
        nik = nikDosen;
    }
    
    void printInfo(){
        System.out.println(
            "Nama Dosen : " + nama + "\n" +
            "Tanngal Lahir : " + tglLahir + "\n" +
            "NIK : " + nik + "\n" +
            "Pendidikan : " + pendidikan +"\n");
    }
    
}
