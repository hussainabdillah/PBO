package Modul7;

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        Manager m2 = new Manager();
        Manager m3 = new Manager();
        Manager m4 = new Manager();
        Manager m5 = new Manager();

        m1.setGajiManager(2000000);
        m1.setjamKerja(8.5f);


        System.out.println(m1.getGajiManager());
        System.out.println(m1.getjamKerja());
    }
}
