package Modul7;

public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    public float getjamKerja(){
        return jamKerja;
    }
//    public void setjamKerja(float jamKerja){
//        this.jamKerja = jamKerja;
//    }
    public float getGajiManager(){
        return getGaji() * 2;
   }
    public void setGajiManager(float gajiManager){
        this.setGaji(gajiManager);
   }

}