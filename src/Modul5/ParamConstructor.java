
package modul5;

public class ParamConstructor {
    String nama,nim;
    int semester ;
    public ParamConstructor(String nama, int semester, String nim){
    this.nama = nama;
    this.nim = nim;
    this.semester = semester;
    }
    
    public void info(){
        System.out.println("Nama : " + nama + "\n" + 
                            "Nim : "+ nim + "\n" + 
                            "Semester : " + semester);
    }
    
}
