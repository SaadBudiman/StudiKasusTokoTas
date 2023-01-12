package Entity;

public abstract class BiodataEntity {
    private String username, password, nama;

    public BiodataEntity(String nama, String username, String password) {
        this.nama = nama;
        this.username = username;
        this.password = password;
    }

    public String getNama(){
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
