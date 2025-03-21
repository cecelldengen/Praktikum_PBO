package chaelsedengen.posttest2;

public class Grup {
    private String id;
    private String nama;
    private int tahunDebut;
    protected String agensi;

    public Grup(String id, String nama, int tahunDebut, String agensi) {
        this.id = id;
        this.nama = nama;
        this.tahunDebut = tahunDebut;
        this.agensi = agensi;
    }

    public void tampilkanData() {
        System.out.println("ID Grup: " + id + " | Nama: " + nama +
                " | Tahun Debut: " + tahunDebut + " | Agensi: " + agensi);
    }
}