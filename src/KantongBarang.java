/*
    Kantong barang yang dibawa oleh user
 */

public class KantongBarang {
    Barang[] arrBarang = new Barang[10];
    int jumBarang  = 0;

    public void tambahBarang(Barang oBarang) {
        arrBarang[jumBarang] = oBarang;
        jumBarang++;
    }

}
