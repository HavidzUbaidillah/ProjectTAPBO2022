package Entity;

public abstract class class_obat
{
    String nama;
    String tipe;
    Double harga;

    public class_obat(String nama, String tipe, Double harga)
    {
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
    }

    public class_obat()
    {

    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama()
    {
        return nama;
    }

    public void setTipe(String tipe)
    {
        this.tipe = tipe;
    }

    public String getTipe()
    {
        return tipe;
    }

    public void setHarga(Double harga)
    {
        this.harga = harga;
    }

    public Double getHarga()
    {
        return harga;
    }
}
