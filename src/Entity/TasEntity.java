package Entity;

public class TasEntity {
    private String merk, warna;

    public TasEntity(String merk, String warna) {
        this.merk = merk;
        this.warna = warna;
    }

    public TasEntity() {
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

}
