package chaelsedengen.posttest3;

public class Album {
    private String id;
    private String nama;
    private String tanggalRilis;
    private String grup;

    public Album(String id, String nama, String tanggalRilis, String grup) {
        this.id = id;
        this.nama = nama;
        this.tanggalRilis = tanggalRilis;
        this.grup = grup;
    }

    public void tampilkanData() {
        System.out.println("\n[ALBUM]");
        System.out.println("ID          : " + id);
        System.out.println("Nama        : " + nama);
        System.out.println("Rilis       : " + tanggalRilis);
        System.out.println("Grup        : " + grup);
    }
}