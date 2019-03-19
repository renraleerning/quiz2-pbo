public class AdeganJendela extends  Adegan {
    boolean isTertutup = true;
    String narasiTertutup = "Rudi mendekati jendela. Rudi mencoba melihat-lihat dan membuka jendela. \"Ah terkunci\"";
    String narasiTerbuka  = "Muncul Zombie!";

    //constructor
    public AdeganJendela () {
        narasi = narasiTertutup;
    }

    /* user berhasil menggunakan kunci untuk membuka pintu */
    @Override
    public void gunakanBarang(Barang barangPilih) {
        super.gunakanBarang(barangPilih); //panggil parent
        isTertutup = false;
        narasi = narasiTerbuka;
        System.out.println("Rudi pelan-pelan membuka Jendela dan Muncul Zombie");
        System.out.println("Rudi diserang zombie \nkesehatan-20");
        oPlayer.kesehatan=oPlayer.kesehatan-20;
    }

}
