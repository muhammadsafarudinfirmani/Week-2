import Base.Elektronik;
import Base.Makanan;
import Base.produk;

public class main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop", "LOQ", 20000000, 10, 2);
        Elektronik HP = new Elektronik("HP", "Samsung", 10000000, 10, 2);
        Makanan indomie = new Makanan("Indomie goreng", 3500, 20, 2030-12-1);
        Makanan roti = new Makanan("Sari Roti", 4000, 20, 2030-12-1);

        //overriding = Satu nama untuk semua
        System.out.println("=====DAFTAR PRODUK=====");
        laptop.tampilkanInfo();
        HP.tampilkanInfo();
        indomie.tampilkanInfo();
        roti.tampilkanInfo();

        //overloading hitungPajak()
        System.out.println("=====Rincikan Pajak Elektronik=====");


        //Versi 1 -Pajak Standart
        double pajakLaptop = laptop.hitungPajak(1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);
        System.out.println("Laptop x1 (PPN standart 11%)");
        System.out.println("subtotal : RP" + laptop.hitungTotalHarga(1));
        System.out.println("Pajak : RP" +pajakLaptop);
        System.out.println("total : RP" + totalLaptop);

        //versi 2 -Pajak custom 5%
        double pajakHPCustom = HP.hitungPajak(1);
        System.out.println("\nHP Samsung x2 (pajak custom5%)");
        System.out.println("subtotal : RP" + HP.hitungTotalHarga(1));
        System.out.println("Pajak : RP" +pajakHPCustom);
        System.out.println("total : RP" + (HP.hitungTotalHarga(2)+ pajakHPCustom));

        //overloading
        System.out.println("\n =====Rincian Diskon Makanan");
        System.out.println("indomie x10 (diskon otomatis)");
        System.out.println("subtotal : RP" + indomie.hitungTotalHarga(10));
        System.out.println("Diskon : RP" + indomie.hitungDiskon(10));
        System.out.println("total : RP" + (indomie.hitungHargaSetelahDiskon(10)));

        //versi 2
        System.out.println("\nRoti x5 (diskon custom 15%)");
        System.out.println("subtotal : RP" + roti.hitungTotalHarga(5));
        System.out.println("Diskon : RP" + roti.hitungDiskon(5));
        System.out.println("total : RP" + roti.hitungTotalHarga(5));

        //transaksi
        System.out.println("\n=====TRANSAKSI======");
        laptop.beli(1);
        HP.beli(1);
        indomie.beli(1);
        roti.beli(1);
    }
}
