package Modul2;

public class RekeningDemo {
	public static void main(String[] args){
		Rekening hussain =  new Rekening();
		
                hussain.no_rekening(200214201);
		hussain.cek_saldo();
		hussain.menabung(1000000);
                hussain.cek_saldo();
		hussain.menarik(500000);
                hussain.cek_saldo();
                hussain.transfer(250000, 200214199);
		hussain.cek_saldo();
	}

}