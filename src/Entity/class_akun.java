package Entity;

public abstract class class_akun
{
    private String nama;
    private String id;
    private String pw;

    public class_akun(String nama, String id, String pw) {
        this.nama = nama;
        this.id = id;
        this.pw = pw;
    }
    public class_akun() {
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPw() {
        return pw;
    }
    public void setPw(String pw) {
        this.pw = pw;
    }
}
