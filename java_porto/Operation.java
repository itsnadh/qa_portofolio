public class Operation {
    public static void main(String[] args){
        int a, b, hasil;
        a =19;
        b=2;
        int tambah = Tambah(a,b);
        int kurang = Kurang(a,b);
        float bagi = Bagi(a,b);
        int kali = Kali(a,b);

        System.out.println("Hasil dari "+a+"+"+b+" = "+tambah);
        System.out.println("Hasil dari "+a+"-"+b+" = "+kurang);
        System.out.println("Hasil dari "+a+":"+b+" = "+bagi);
        System.out.println("Hasil dari "+a+"x"+b+" = "+kali);
    }
    public static int Tambah(int a, int b){
        int hasilTambah = a+b;
        return hasilTambah;
    }
    public static int Kurang(int a, int b){
        int hasilKurang = a-b;
        return hasilKurang;
    }

    public static float Bagi(float a, float b){
        float hasilBagi = a/b;
        return hasilBagi;
    }

    public static int Kali(int a, int b){
        int hasilKali = a*b;
        return hasilKali;
    }
}
