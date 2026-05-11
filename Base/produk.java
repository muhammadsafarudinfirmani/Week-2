package Base;

public abstract class produk {
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
    public double hitungTotalHarga(int jumlah){
        return harga * jumlah;        
    }

    public abstract double hitungDiskon(int jumlahBeli);
    public void beli(int jumlahBeli){
        if (jumlahBeli <= 0) {
            System.out.println("jumlah beli harus lebih dari 0");
            return;
        }if (jumlahBeli > stok) {
            System.out.println("stok" + nama + "tidak cukup! tersisa:" + stok);
            return;
        }
        stok -= jumlahBeli;
    }

    public void tampilkanInfo(){
        System.out.println("Produk:" + nama);
        System.out.println("Harga:" + harga);
        System.out.println("Stok:" + stok);
        System.out.println("--------------------");
    }

    

}
