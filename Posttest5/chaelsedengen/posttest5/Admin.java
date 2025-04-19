package chaelsedengen.posttest5;

public class Admin {
    private String username;
    private String password;

    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public final void tampilkanHakAkses() {
        System.out.println("Admin dapat mengelola seluruh data: Idol, Grup, Agensi, Album, dan Fans.");
    }
}