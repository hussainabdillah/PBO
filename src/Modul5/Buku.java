package modul5;
public class Buku {
    String namaPengarang,  judulBuku;
    int tahunTerbit, cetakanKe;
    double harga;
    
    public Buku(int tahunTerbit, int cetakanKe){
    this.tahunTerbit = tahunTerbit;
    this.cetakanKe = cetakanKe;
    }
    public Buku (String namapengarang, String judulBuku,
                int tahunTerbit, int cetakanKe){
    this(tahunTerbit,cetakanKe);
    this.namaPengarang = namapengarang;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.cetakanKe = cetakanKe;
    }
    public Buku(String namapengarang, String judulBuku,
                int tahunTerbit, int cetakanKe, double harga){
    this(namapengarang,judulBuku,tahunTerbit,cetakanKe);
    this.namaPengarang = namapengarang;
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.cetakanKe = cetakanKe;
    this.harga =  harga;
    }
    public void info(){
        System.out.println(
                            "Nama Pengarang\t : " + namaPengarang + "\n" + 
                            "Judul Buku\t : "+ judulBuku + "\n" +
                            "Tahun Terbit\t : " + tahunTerbit + "\n" +
                            "Cetakan Ke\t : " + cetakanKe + "\n" +
                            "Harga\t \t : " + harga + "\n" );
    }
}