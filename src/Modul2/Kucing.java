package Modul2;

public class Kucing {
    int umur ;
    String warnaBulu;
    
void meong(){
    System.out.println("Meong Meong");
}

void umur (int umurKucing){
    umur = umurKucing;
}

void warnaBulu (String buluKucing){
    warnaBulu = buluKucing;
}

void printInfo(){
    System.out.println(
	"Umur : " + umur + "\n"+
	"Warna Bulu : " + warnaBulu + "\n");
        }
}


