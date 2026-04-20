package Toko;

import Base.produk;


class Pemasukan extends produk {

    private double totalpemasukan;

    public Pemasukan(String nama, double harga, int stok, String kategori){
        super(nama, harga, stok, kategori);
        this.totalpemasukan = 0;
    }

    void tambahPemasukan(int jumlah){
        if (jumlah <= stok) {
            totalpemasukan += jumlah * harga;
            stok -= jumlah;
        }else{
            System.out.println("stok tidak cukup!");
        }
    }
}
