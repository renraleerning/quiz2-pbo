import java.util.Scanner;

public class Adegan {
    //kantongbarang milik user
    public static KantongBarang oKantongBarang;  //static, sama untuk semua objek adegan
    String narasi;
    //idealnya menggunakan ArrayList
    //pilihan yang bisa dipilih user untuk setiap adegan
    int jumPil = 0;
    Pilihan[] arrPilihan = new Pilihan[10];
    Scanner sc = new Scanner(System.in);



    public void mainkan() {
        //print narasi dan pilihan
        System.out.println(narasi);


        //khusus untuk kantong
        System.out.println("0. Lihat isi kantong barang");

        for (int i = 0; i<jumPil;i++) {
            System.out.print(String.format("%d.",i+1));
            arrPilihan[i].print();
        }
        System.out.println("Pilihan anda:");
        int pilihan = sc.nextInt();
        System.out.println("x"+pilihan);
    }

    public void tambahPilihan(Pilihan oPilihan) {
        arrPilihan[jumPil] = oPilihan;
        jumPil++;
    }
}
