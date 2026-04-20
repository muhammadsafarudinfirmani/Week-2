package Base;

public class produk {
    //atribut
    private String nama;
    private double harga;
    private int stok;

    //Constructor
    public produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public double getHarga(){
        return harga;
    }
    public double getStok(){
        return stok;
    }
    public String getNama(){
        return nama;
    }

    public void tampilkaninfo(){
        System.out.println("Produk:" + nama);
        System.out.println("Harga:" + harga);
        System.out.println("Stok:" + stok);
        System.out.println("--------------------");
    }

    

}
