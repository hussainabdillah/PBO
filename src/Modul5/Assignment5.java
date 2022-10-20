package modul5;
public class Assignment5 {
    String nama;
    String nim;
    String jurusan;
    int semester;
    String alamat;
    
    public Assignment5(){
        System.out.println("Default Constructor telah berhasil dibuat ");
    }
    
    public Assignment5(String nama, String nim, String jurusan,int semester, String alamat){
    this();
    this.nama = nama;
    this.nim  = nim;
    this.jurusan = jurusan;
    this.semester =  semester;
    this.alamat  = alamat;
    }
    
    public void info(){
    System.out.println("Nama\t : " + nama + "\n" + 
                       "Nim\t : "+ nim + "\n" +
                        "Jurusan\t : "+ jurusan + "\n" +
                        "Semester : "+ semester + "\n" +
                        "Alamat\t : "+ alamat + "\n");
    }
}
