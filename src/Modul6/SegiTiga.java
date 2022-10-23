package Modul6;

public class SegiTiga extends BangunDatar {
    double alas = 2;
    double tinggi = 5; //suppose tinggi is five becausee in modul is not stated variable for tinggi
    double sisiA = 3; //suppose sisiA is three becausee in modul is not stated variable for sisiA
    double sisiB = 4; //suppose sisiB is four becausee in modul is not stated variable for sisiB

    protected void hitungKelilingSegitiga(double alas, double sisiA, double sisiB) {
        keliling = (double) (sisiA + sisiB + alas);
    }
}