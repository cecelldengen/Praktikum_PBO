package chaelsedengen.posttest3;

public class Grup {
    private String id;
    private String nama;
    protected int tahunDebut;
    protected String agensi;

    public Grup(String id, String nama, int tahunDebut, String agensi) {
        this.id = id;
        this.nama = nama;
        this.tahunDebut = tahunDebut;
        this.agensi = agensi;
    }

    public void tampilkanData() {
        System.out.println("\n[GRUP]");
        System.out.println("ID         : " + id);
        System.out.println("Nama       : " + nama);
        System.out.println("Debut      : " + tahunDebut);
        System.out.println("Agensi     : " + agensi);
    }
}