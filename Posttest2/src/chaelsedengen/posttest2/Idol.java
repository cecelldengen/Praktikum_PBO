package chaelsedengen.posttest2;

public class Idol {
    private String id;
    private String nama;
    private int umur;
    protected String posisi;
    String grup;

    public Idol(String id, String nama, int umur, String posisi, String grup) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
        this.grup = grup;
    }

    public void tampilkanData() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Umur: " + umur +
                " | Posisi: " + posisi + " | Grup: " + grup);
    }
}