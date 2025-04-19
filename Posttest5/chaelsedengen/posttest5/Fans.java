package chaelsedengen.posttest5;

public final class Fans {
    private final String idFans;
    private String nama;
    private String email;

    public Fans(String idFans, String nama, String email) {
        this.idFans = idFans;
        this.nama = nama;
        this.email = email;
    }

    public void tampilkanIdentitas() {
        System.out.println("=== Data Fans ===");
        System.out.println("ID Fans: " + idFans);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
    }
}