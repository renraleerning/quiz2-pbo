public class AdeganKeluarKoridor extends  Adegan {
    //constructor
    public AdeganKeluarKoridor () {
        narasi = "Rudi Koridor terlalu gelap!";
    }
    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        System.out.println("Rudi pelan-pelan Melangkah keluar Koridor");
        oPlayer.isSelesai=true;
    }
}
