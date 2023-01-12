package Entity;

public class AdminEntity extends BiodataEntity {
    private String alamat;

    public AdminEntity(String nama, String alamat, String username, String password) {
        super(nama, username, password);
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    @Override
    public String getNama() {
        return null;
    }
}
