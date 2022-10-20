package Modul2;

public class RotiDemo {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n" + "---Roti 1---");
        Roti roti1 = new Roti();
        roti1.beriWarna("Hijau");
        roti1.beriRasa("Pandan");
        roti1.timbangBerat(30);
        roti1.hargaJual(6000);
        roti1.beriMerk("Sari Roti");
        roti1.infoRoti();
        
        System.out.println("\n" + "---Roti 2---");
        Roti roti2 = new Roti();
        roti2.beriWarna("Kuning Keju");
        roti2.beriRasa("Keju");
        roti2.timbangBerat(40);
        roti2.hargaJual(2500);
        roti2.beriMerk("Aoka");
        roti2.infoRoti();
        
        System.out.println("\n" + "---Roti 3---");
	Roti roti3 = new Roti();
        roti3.beriWarna("Coklat");
	roti3.beriRasa("Coklat");
	roti3.timbangBerat(48);
	roti3.hargaJual(15000);
        roti3.beriMerk("Bread Talk");
	roti3.infoRoti();
        
        System.out.println("\n" + "---Roti 4---");
	Roti roti4 = new Roti();
	roti4.beriWarna("Coklat");
	roti4.beriRasa("Dorayaki");
	roti4.timbangBerat(35);
	roti4.hargaJual(7000);
        roti4.beriMerk("Paroti");
	roti4.infoRoti();
        
        
                
    }
    
}
