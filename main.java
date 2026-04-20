import Base.Elektronik;
import Base.Makanan;
import Base.produk;

public class main {
    public static void main(String[] args) {
        Elektronik e = new Elektronik("Mesin cuci", 1000000.0, 1, 1);
        e.setGaransi(12);
        e.tampilData();

        Makanan m = new Makanan("Mie ayam", 15000, 1, 2);
        m.setExpired(2031);
        m.tampilData();
    }
}
