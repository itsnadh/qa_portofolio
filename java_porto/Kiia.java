public class Kiia {

    // yang ini method static void
    public static void sayHi(String name) {
        System.out.println("Hi, Namaku " + name + "!"); // dia ga return apa2, ngeprint doang
    }

    // yang ini method static ga void (int)
    public static int usiaKu(int tahunLahir) {
        int usia = 2022 - tahunLahir;
        return usia; // nah dia harus ngereturn sesuatu yg tipenya int
    }

    // yang ini method non static void
    public void hobiKu(String hobi) {
        System.out.println("Hobiku adalah makan, makan, makan, dan " + hobi);
    }

    // yang ini method non static int
    public int sisaUang(int income, int expense) {
        int sisa = income - expense;
        return sisa;
    }

    public static void main(String[] args) {
        String name = "Mba Kiia";
        // ini manggil method static void
        sayHi(name);

        int tahunLahir = 1998;
        // ini manggil method static ga void (int)
        System.out.println("Usia ku " + usiaKu(tahunLahir) + " tahun");

        String hobi = "tidur";
        // hobiKu(hobi); // ini gabisa nih kaya gini

        // ini manggil method non static
        Kiia mbaKiia = new Kiia(); // ini namanya instansiasi -> jadi bikin object dari Class Kiia
                                   // yang punya method hobiKu

        mbaKiia.hobiKu(hobi); // nah ini baru bisa dipanggil deh methodnya

        // intinya gitu lah
        int sisa = mbaKiia.sisaUang(100000000, 1);
        System.out.println("Aku punya uang " + sisa + " rupiah");
    }
}
