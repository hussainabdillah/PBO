package Modul2;

public class Car {
    int cadence;
    int speed;
    int gear;
    
    void changeCadence(int newCadence){
        cadence = newCadence;
    }
    void speedUp(int newspeed ) {
	speed = newspeed;
	}
    void changeGear(int newgear ) {
	gear = newgear;
	}	
    void printInfo(){
    System.out.println(
	"Cadence : " + cadence + "\n"+
	"Speed : " + speed + "\n"+
	"Gear : " + gear + "\n");
        }
}
