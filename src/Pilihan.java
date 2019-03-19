/*
    Pilihan aksi untuk setiap adegan
 */

public class Pilihan {
    String deskripsi;
    public static Player oPlayer;
    /*method yang akan dipanggil jika pilihan dipilih user*/
    public void aksi(){
    }

    //constructor
    public Pilihan(String deskripsi) {
        this.deskripsi= deskripsi;
    }

    public void print() {
        System.out.println(deskripsi);
    }
}
