package Base;



public class Elektronik extends produk {
    private int masaGaransi;
    private String merek;
    private static final double PPN = 0.11;


    public Elektronik(String nama,String merek, double harga, int stok, int masaGransi){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
        this.merek = merek;
    }
    //override
    @Override
    public void tampilkanInfo(){
        super.tampilkanInfo();
        System.out.println("masa garansi:" + masaGaransi);
    }
    @Override
    public double hitungDiskon(int jumlahBeli){
        return jumlahBeli*0.80;
    }
    //overloading
    public double hitungPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * PPN;
    }
    //version 2
    public double hitungPajak(int jumlahBeli, double persenPajak){
        return hitungTotalHarga(jumlahBeli) * (persenPajak / 100);
    }

    public double hitungHargaSetelahPajak(int jumlahBeli){
        return hitungTotalHarga(jumlahBeli) * hitungPajak(jumlahBeli);
    }

    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }

}

