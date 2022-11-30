package Modul7;

public class ManagerDemo {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.setGajiManager(2000000);
//        m1.setjamKerja(8.5f);

        System.out.println(m1.getGajiManager());
        System.out.println(m1.getjamKerja());
    }
}
