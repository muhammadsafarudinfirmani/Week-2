import Base.produk;

public class main {
    public static void main(String[] args) {
        produk p = new produk( "indomie goreng",  5000,  100, "makanan");

        System.out.println(p.getHarga());
        System.out.println(p.getNama());
        System.out.println(p.getStok());
        p.setHarga(10000);
        p.setStok(150);
        System.out.println(p.getHarga());
        System.out.println(p.getNama());
        System.out.println(p.getStok());
    }
}
