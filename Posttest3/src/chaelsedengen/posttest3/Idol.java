package chaelsedengen.posttest3;

public class Idol {
    private String id;
    private String nama;
    private int umur;
    private String posisi;
    private String grup;

    public Idol(String id, String nama, int umur, String posisi, String grup) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
        this.grup = grup;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public String getPosisi() {
        return posisi;
    }

    public void setPosisi(String posisi) {
        this.posisi = posisi;
    }

    public String getGrup() {
        return grup;
    }

    public void setGrup(String grup) {
        this.grup = grup;
    }

    public void tampilkanData() {
        System.out.println("\n[IDOL]");
        System.out.println("ID     : " + id);
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur);
        System.out.println("Posisi : " + posisi);
        System.out.println("Grup   : " + grup);
    }
}