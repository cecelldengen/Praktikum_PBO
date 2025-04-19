package chaelsedengen.posttest5;

public abstract class DataKPop {
    protected String nama;

    // Constructor
    public DataKPop(String nama) {
        this.nama = nama;
    }

    // Abstract method wajib dioverride
    public abstract void tampilkanData();

    // Method non-abstract
    public void identitas() {
        System.out.println("Data K-Pop Umum");
    }
}