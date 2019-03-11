public class Adegan {
    String narasi;
    //idealnya menggunakan ArrayList
    int jumPil = 0;
    Pilihan[] arrPilihan = new Pilihan[10];

    public void mainkan() {
        //print narasi dan pilihan
        System.out.println(narasi);
        System.out.println("Pilihan anda:");
        for (int i = 0; i<jumPil;i++) {
            System.out.print(String.format("%d.",i));
            arrPilihan[i].print();
        }

    }

    public void tambahPilihan(Pilihan oPilihan) {
        arrPilihan[jumPil] = oPilihan;
        jumPil++;
    }
}
