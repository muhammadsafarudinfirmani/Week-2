package Base;



public class Elektronik extends produk {
    private int masaGaransi;


    public Elektronik(String nama, double harga, int stok, int masaGransi){
        super(nama, harga, stok);
        this.masaGaransi = masaGaransi;
    }

    public void tampilData(){
        super.tampilkaninfo();
        System.out.println("masa garansi:" + masaGaransi);
    }

    public void setGaransi(int masaGaransi){
        this.masaGaransi = masaGaransi;
    }

}

