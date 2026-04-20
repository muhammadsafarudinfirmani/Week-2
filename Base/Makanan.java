package Base;

public class Makanan extends produk {
    private int expired;


    public Makanan(String nama, double harga, int stok, int expired){
        super(nama, harga, stok);
        this.expired = expired;
    }

    public void tampilData(){
        super.tampilkaninfo();
        System.out.println("expired:" + expired);
    }

    public void setExpired(int expired){
        this.expired = expired;
    }

}


