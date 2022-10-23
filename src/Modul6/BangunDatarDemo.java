package Modul6;

public class BangunDatarDemo {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        persegi.hitungLuas(persegi.sisi, persegi.sisi);
        System.out.println("Persegi");
        System.out.println("Luas Persegi: " + persegi.luas);
        persegi.hitungKeliling(persegi.sisi, persegi.sisi);
        System.out.println("Keliling Persegi: " + persegi.keliling + "\n");

        PersegiPanjang persegiPanjang = new PersegiPanjang();
        persegiPanjang.hitungLuas(persegiPanjang.panjang, persegiPanjang.lebar);
        System.out.println("Persegi Panjang");
        System.out.println("Luas Persegi Panjang: " + persegiPanjang.luas);
        persegiPanjang.hitungKeliling(persegiPanjang.panjang, persegiPanjang.lebar);
        System.out.println("Keliling Persegi Panjang: " + persegiPanjang.keliling + "\n");

        SegiTiga segitiga = new SegiTiga();
        segitiga.hitungLuas(segitiga.alas/2, segitiga.tinggi);
        System.out.println("Segitiga");
        System.out.println("Luas Segitiga: " + segitiga.luas);
        segitiga.hitungKelilingSegitiga(segitiga.alas, segitiga.sisiA, segitiga.sisiB);
        System.out.println("Keliling Segitiga: " + segitiga.keliling + "\n");

        SegiTigaSamaKaki segiTigaSamaKaki = new SegiTigaSamaKaki();
        segiTigaSamaKaki.alas = 3;
        segiTigaSamaKaki.hitungLuas(segiTigaSamaKaki.alas/2,
                (Math.sqrt(Math.pow(segiTigaSamaKaki.sisiMiring,2) - Math.pow(segiTigaSamaKaki.alas/2,2))));
        System.out.println("Segitiga Sama Kaki");
        System.out.println("Luas Segitiga Sama Kaki: " + segiTigaSamaKaki.luas);
        segiTigaSamaKaki.hitungKelilingSegitiga(segiTigaSamaKaki.sisiMiring, segiTigaSamaKaki.sisiMiring, segiTigaSamaKaki.alas);
        System.out.println("Keliling Segitiga Sama Kaki: " + segiTigaSamaKaki.keliling + "\n");

        SegiTigaSamaSisi segiTigaSamaSisi = new SegiTigaSamaSisi();
        segiTigaSamaSisi.alas = segiTigaSamaSisi.sisi;
        segiTigaSamaSisi.hitungLuas(segiTigaSamaSisi.alas/2,
                (Math.sqrt(Math.pow(segiTigaSamaSisi.sisi,2) - Math.pow(segiTigaSamaSisi.alas/2,2))));
        System.out.println("Segitiga Sama Sisi");
        System.out.println("Luas Segitiga Sama Sisi: " + segiTigaSamaSisi.luas);
        segiTigaSamaSisi.hitungKelilingSegitiga(segiTigaSamaSisi.sisi, segiTigaSamaSisi.sisi, segiTigaSamaSisi.sisi);
        System.out.println("Keliling Segitiga Sama Sisi: " + segiTigaSamaSisi.keliling + "\n");


    }
}
