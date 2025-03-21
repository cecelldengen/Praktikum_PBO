package chaelsedengen.posttest2;

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
        System.out.println("ID Album: " + id + " | Nama: " + nama +
                " | Tanggal Rilis: " + tanggalRilis + " | Grup: " + grup);
    }
}