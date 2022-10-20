package Modul3;

public class Nilai {
    double nilaiUTS;
    double nilaiUAS;
    double nilaiTugas;
    double nilaiTotal;
    
    public double getUTS(double nilaiUTS){
     return this.nilaiUTS=nilaiUTS;
    }
    
    public double getUAS(double nilaiUAS){
     return this.nilaiUAS=nilaiUAS;
    }
    
    public double getTugas(double nilaiTugas){
     return this.nilaiTugas=nilaiTugas;
    }
    
    public void infoNilai(){
        System.out.println("Nilai UTS: " + nilaiUTS + "\n" +
                           "Nilai UAS: " + nilaiUAS + "\n" +
                           "Nilai UTS: " + nilaiTugas + "\n");
    }
    
    void nilaiTotal(){
        nilaiTotal = (nilaiTugas + nilaiUAS + nilaiUTS)/3;
        System.out.println("Nilai Total: " + nilaiTotal);
    }
    
}
