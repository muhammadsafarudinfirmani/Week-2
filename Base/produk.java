package Base;

public class produk {
    //atribut
    private String nama;
    private double harga;
    private int stok;

    //Constructor
    public produk(String nama, double harga, int stok) {
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

    public void setHarga(double harga){
        this.harga = harga;
    }
    public void setStok(int stok){
        this.stok = stok;
    }
    public void kurangiStok(int jumlah){
        if (jumlah > stok) {
            System.out.println("melebihi stok yang tersedia");
        }else {
            stok = stok - jumlah;
        }
    }

    public void tampilkaninfo(){
        System.out.println("Produk:" + nama);
        System.out.println("Harga:" + harga);
        System.out.println("Stok:" + stok);
        System.out.println("--------------------");
    }

    

}
