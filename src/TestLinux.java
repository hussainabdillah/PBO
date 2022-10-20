public class TestLinux {
    String nama;
    int umur;
    String alamat;

    public void infoPribadi(String nama, int umur, String alamat) {
        this.nama = nama;
        this.umur = umur;
        this.alamat = alamat;
    }
    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Alamat: " + alamat);
    }
    public void testGithubCopilot(){
        System.out.println("Thanks to Copilot for the Automatic code.");
        System.out.println("Trying to make javadoc");

        //create method to count lines
        System.out.println("Counting lines");
    } 
    public static void main(String[] args) {
        System.out.println("Hello World!");
        TestLinux hussain = new TestLinux();
        hussain.infoPribadi("Hussain Abdillah Tugas Kelarno", 20,"Sukoharjo");
        hussain.testGithubCopilot();
        hussain.tampilkan();
    }
}

