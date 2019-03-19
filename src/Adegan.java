import java.util.ArrayList;
import java.util.Scanner;

public class Adegan {

    //static, satu objek player yang sama untuk semua objek adegan
    public static Player oPlayer;
    Integer Zombie = 100;

    //pilihan yang ada di semua adegan
    PilihanGunakanKantong oPilihanGunakanKantong;  //lihat barang milik player dan gunakan
    PilihanLihatBarang oPilihanLihatBarang;        //lihat barang di dalam adegan dan pindahkan ke kantong player

    //barang yg valid digunakan dalam adegan ini (misal kunci dalam adegan pintu)
    String idBarangBisaDigunakan;


    String narasi;
    //idealnya menggunakan ArrayList
    //pilihan yang bisa dipilih user untuk setiap adegan
    int jumPil = 0;
    ArrayList<Pilihan> arrPilihan = new ArrayList<>();
    //Pilihan[] arrPilihan = new Pilihan[10];


    //constructor
    public Adegan() {
        //setiap adegan memiliki 2 pilihan yg sama yaitu untuk melihat barang milik player dan melihat barang dalam adegan tsb.
        oPilihanGunakanKantong = new PilihanGunakanKantong(this,"Lihat dan gunakan barang yang dimiliki player");
        tambahPilihan(oPilihanGunakanKantong);

        oPilihanLihatBarang = new PilihanLihatBarang(this,"Lihat barang di sekitar...");
        tambahPilihan(oPilihanLihatBarang);

    }

    //tambah barang yg berada di adegan
    public void tambahBarang(Barang vBarang) {
        oPilihanLihatBarang.tambahBarang(vBarang);
    }


    /*
       tambah pilihan
     */
    public void tambahPilihan(Pilihan oPilihan) {
        arrPilihan.add(oPilihan);
        jumPil++;
    }


    public void mainkan() {
        oPlayer.kesehatan=oPlayer.kesehatan-5;
        if (oPlayer.kesehatan<=0){
            System.out.println("Kesehatan Rudi telah habis\nGame Berakhir");
            System.exit(0);
        }
        //print narasi dan pilihan
        System.out.println("\nKesehatan Pemain : "+oPlayer.kesehatan); //spasi/
        System.out.println(narasi);


       /* //print pilihan
       for (int i = 0; i < jumPil; i++) {
            System.out.print(String.format("%d. %s \n", i + 1,arrPilihan.get(i).deskripsi));
        }
       */
        int i=0;
        for (Pilihan data:arrPilihan){
            i++;
            System.out.print(String.format("%d %s \n",i,data.deskripsi));
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Pilihan anda:");
        int pilihan = sc.nextInt();
        System.out.println(""); //spasi

        //eksekusi pilihan yang dipilih user
        //arrPilihan[pilihan-1].aksi();
        arrPilihan.get(pilihan-1).aksi();
    }

    //User memilih barang yang dimiliki player. lihat class PilihanGunakanKantong
    public void gunakanBarang(Barang barangPilih) {
          System.out.println(String.format("Rudi mengambil %s dan menggunakannya...",barangPilih.deskripsi));
          if(barangPilih.deskripsi=="donat"){
              oPlayer.kesehatan=oPlayer.kesehatan+50;
          }
    }
}
