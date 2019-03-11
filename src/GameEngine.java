public class GameEngine {
    Adegan adeganAwal; //awal adegan yang akan dijalankan


    public void tambahAdegan(Adegan oAdegan) {

    }

    public void mulai() {
        adeganAwal.mainkan();
    }

    public static void main(String[] args) {

        //init data cerita
        // == adegan awal
        Adegan  adeganAwal = new Adegan();
        adeganAwal.narasi =
                "Rudi terbangun disebuah ruangan yang tidak dikenal. Dia melihat sekeliling, \n" +
                "ada pintu dan sebuah meja kecil";
        Pilihan pilihanMenujuPintu = new PilihanGantiAdegan("Menuju pintu");
        Pilihan pilihanMenujuMeja  = new PilihanGantiAdegan("Menuju meja");
        adeganAwal.tambahPilihan(pilihanMenujuPintu);
        adeganAwal.tambahPilihan(pilihanMenujuMeja);


        // == adegan menuju pintu
        Adegan adeganPintu = new Adegan();
        adeganPintu.narasi = "Rudi mendekati pintu. Rudi mencoba membuka pintu. \"Ah terkunci\"";
        adeganPintu.tambahPilihan(pilihanMenujuMeja); //pilihan ke meja direuse



        //== init game engine
        GameEngine ge = new GameEngine();
        ge.tambahAdegan(adeganAwal);
        ge.tambahAdegan(adeganPintu);
        //ge.tambahAdegan(adeganMeja);
        ge.adeganAwal = adeganAwal;
        ge.mulai();
    }
}
