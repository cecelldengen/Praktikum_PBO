package chaelsedengen.posttest5;

public class Idol extends DataKPop {
    private String tanggalLahir;
    private String grup;
    private String agensi;

    public Idol(String nama, String tanggalLahir, String grup, String agensi) {
        super(nama);
        this.tanggalLahir = tanggalLahir;
        this.grup = grup;
        this.agensi = agensi;
    }

    // Override abstract method
    @Override
    public void tampilkanData() {
        System.out.println("=== Data Idol ===");
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Grup: " + grup);
        System.out.println("Agensi: " + agensi);
    }

    // Overloading (Polymorphism)
    public void tampilkanData(boolean detail) {
        if (detail) {
            tampilkanData();
        } else {
            System.out.println("Idol: " + nama);
        }
    }
}