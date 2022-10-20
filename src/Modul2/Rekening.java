package Modul2;

public class Rekening {
	double saldo = 1000000;
	int no_rekening;
	String nama_rekening = "Hussain Abdillah";
	
	void no_rekening(int rekening){
		this.no_rekening = rekening;
		          System.out.println("No rekening Anda " + no_rekening + " atas Nama " + this.nama_rekening);
	}
	void cek_saldo(){
		System.out.println("Saldo anda tersisa: Rp" + this.saldo);
	}
	void menabung(double jumlahMenabung){
                this.saldo += jumlahMenabung;
		System.out.println("Berhasil menabung : Rp" + jumlahMenabung + " ke rekening Anda");
	}
	void menarik(double jumlahMenarik){
                this.saldo -= jumlahMenarik;
		System.out.println("Anda telah menarik Uang sebesar : Rp" + jumlahMenarik + " dari rekening Anda");
	}
	void transfer(double jumlahTransfer, int rekeningTujuan){
		this.saldo -= jumlahTransfer;
                System.out.println(
		"Berhasil transfer sebesar : Rp" + jumlahTransfer + " ke rekening " + rekeningTujuan);
		
	}
}
