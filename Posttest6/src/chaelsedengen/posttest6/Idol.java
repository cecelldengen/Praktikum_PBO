package chaelsedengen.posttest6;

public class Idol implements IdolInterface {
    private String nama;
    private String grup;
    private static int jumlahIdol = 0; // Static variable

    public Idol(String nama, String grup) {
        this.nama = nama;
        this.grup = grup;
        jumlahIdol++;
    }

    public String getNama() {
        return nama;
    }

    public String getGrup() {
        return grup;
    }

    public static int getJumlahIdol() {
        return jumlahIdol;
    }

    @Override
    public void tampilkanData() {
        System.out.println("Nama: " + nama + " | Grup: " + grup);
    }

    @Override
    public void updateData(String namaBaru, String grupBaru) {
        this.nama = namaBaru;
        this.grup = grupBaru;
    }
}