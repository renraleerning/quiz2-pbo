/*
    Pilihan aksi untuk setiap adegan
 */

public class Pilihan {
    String narasi;
    public void aksi(){}
    public Pilihan(String narasi) {
        this.narasi = narasi;
    }

    public void print() {
        System.out.println(narasi);
    }
}
