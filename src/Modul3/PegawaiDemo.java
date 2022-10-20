package Modul3;

public class PegawaiDemo {
    public static void main(String[] args) {
        Pegawai pegawai1 = new Pegawai();
        Pegawai pegawai2 = new Pegawai();
        Pegawai pegawai3 = new Pegawai();
        Pegawai pegawai4 = new Pegawai();
        Pegawai pegawai5 = new Pegawai();
        
        pegawai1.setNama("Sumbul");
        pegawai1.setNip(202);
        pegawai1.setGaji(200000);
        System.out.println("Nama pegawai: " + pegawai1.nama +  "\n" + 
                            "NIP: " + pegawai1.nip + "\n" + 
                            "Gaji: " + pegawai1.gaji + "\n");
        
        pegawai2.setNama("katakkuri");
        pegawai2.setNip(505);
        pegawai2.setGaji(100000);
        System.out.println("Nama pegawai: " + pegawai2.nama +  "\n" + 
                            "NIP: " + pegawai2.nip + "\n" + 
                            "Gaji: " + pegawai2.gaji + "\n");
        
        pegawai3.setNama("Ojisan");
        pegawai3.setNip(909);
        pegawai3.setGaji(900000);
        System.out.println("Nama pegawai: " + pegawai3.nama +  "\n" + 
                            "NIP: " + pegawai3.nip + "\n" + 
                            "Gaji: " + pegawai3.gaji + "\n");
        
        pegawai4.setNama("brimstonk");
        pegawai4.setNip(738);
        pegawai4.setGaji(800000);
        System.out.println("Nama pegawai: " + pegawai4.nama +  "\n" + 
                            "NIP: " + pegawai4.nip + "\n" + 
                            "Gaji: " + pegawai4.gaji + "\n");
        
        pegawai5.setNama("Nyi Yae");
        pegawai5.setNip(636);
        pegawai5.setGaji(1000000);
        System.out.println("Nama pegawai: " + pegawai5.nama +  "\n" + 
                            "NIP: " + pegawai5.nip + "\n" + 
                            "Gaji: " + pegawai5.gaji + "\n");
//        pegawai2.infoPegawai("alkururi", 302, 155800);
//        pegawai3.infoPegawai("kirot", 782, 92019);
//        pegawai4.infoPegawai("brimstonk", 821, 144714);
//        pegawai5.infoPegawai("siti raiden", 909, 171719);
    }
}
