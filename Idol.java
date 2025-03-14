import java.util.ArrayList;
import java.util.Scanner;

class Idol {
    String id;
    String nama;
    int umur;
    String posisi;
    String grup;

    public Idol(String id, String nama, int umur, String posisi, String grup) {
        this.id = id;
        this.nama = nama;
        this.umur = umur;
        this.posisi = posisi;
        this.grup = grup;
    }

    public void tampilkanData() {
        System.out.println("ID: " + id + " | Nama: " + nama + " | Umur: " + umur + " | Posisi: " + posisi + " | Grup: " + grup);
    }
}

class Grup {
    String id;
    String nama;
    int tahunDebut;
    String agensi;

    public Grup(String id, String nama, int tahunDebut, String agensi) {
        this.id = id;
        this.nama = nama;
        this.tahunDebut = tahunDebut;
        this.agensi = agensi;
    }

    public void tampilkanData() {
        System.out.println("ID Grup: " + id + " | Nama: " + nama + " | Tahun Debut: " + tahunDebut + " | Agensi: " + agensi);
    }
}

class Album {
    String id;
    String nama;
    String tanggalRilis;
    String grup;

    public Album(String id, String nama, String tanggalRilis, String grup) {
        this.id = id;
        this.nama = nama;
        this.tanggalRilis = tanggalRilis;
        this.grup = grup;
    }

    public void tampilkanData() {
        System.out.println("ID Album: " + id + " | Nama Album: " + nama + " | Tanggal Rilis: " + tanggalRilis + " | Grup: " + grup);
    }
}

class Main {
    static ArrayList<Idol> daftarIdol = new ArrayList<>();
    static ArrayList<Grup> daftarGrup = new ArrayList<>();
    static ArrayList<Album> daftarAlbum = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN DATA IDOL K-POP ===");
            System.out.println("1. Tambah Idol");
            System.out.println("2. Tambah Grup");
            System.out.println("3. Tambah Album");
            System.out.println("4. Tampilkan Semua Data");
            System.out.println("5. Update Data Idol");
            System.out.println("6. Hapus Data Idol");
            System.out.println("7. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    tambahIdol();
                    break;
                case 2:
                    tambahGrup();
                    break;
                case 3:
                    tambahAlbum();
                    break;
                case 4:
                    tampilkanSemuaData();
                    break;
                case 5:
                    updateIdol();
                    break;
                case 6:
                    hapusIdol();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 7);
    }

    static void tambahIdol() {
        System.out.print("Masukkan ID Idol: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Idol: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Umur Idol: ");
        int umur = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Posisi Idol: ");
        String posisi = scanner.nextLine();
        System.out.print("Masukkan Nama Grup: ");
        String grup = scanner.nextLine();

        daftarIdol.add(new Idol(id, nama, umur, posisi, grup));
        System.out.println("Idol berhasil ditambahkan!");
    }

    static void tambahGrup() {
        System.out.print("Masukkan ID Grup: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Grup: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tahun Debut: ");
        int tahunDebut = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Agensi: ");
        String agensi = scanner.nextLine();

        daftarGrup.add(new Grup(id, nama, tahunDebut, agensi));
        System.out.println("Grup berhasil ditambahkan!");
    }

    static void tambahAlbum() {
        System.out.print("Masukkan ID Album: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Album: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tanggal Rilis (YYYY-MM-DD): ");
        String tanggalRilis = scanner.nextLine();
        System.out.print("Masukkan Nama Grup: ");
        String grup = scanner.nextLine();

        daftarAlbum.add(new Album(id, nama, tanggalRilis, grup));
        System.out.println("Album berhasil ditambahkan!");
    }

    static void tampilkanSemuaData() {
        if (daftarIdol.isEmpty() && daftarGrup.isEmpty() && daftarAlbum.isEmpty()) {
            System.out.println("Belum ada data yang tersedia.");
            return;
        }

        System.out.println("\n=== DAFTAR IDOL ===");
        for (Idol idol : daftarIdol) {
            idol.tampilkanData();
        }

        System.out.println("\n=== DAFTAR GRUP ===");
        for (Grup grup : daftarGrup) {
            grup.tampilkanData();
        }

        System.out.println("\n=== DAFTAR ALBUM ===");
        for (Album album : daftarAlbum) {
            album.tampilkanData();
        }
    }

    static void updateIdol() {
        System.out.print("Masukkan ID Idol yang ingin diperbarui: ");
        String id = scanner.nextLine();

        for (Idol idol : daftarIdol) {
            if (idol.id.equals(id)) {
                System.out.print("Masukkan Nama Baru: ");
                idol.nama = scanner.nextLine();
                System.out.print("Masukkan Umur Baru: ");
                idol.umur = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Posisi Baru: ");
                idol.posisi = scanner.nextLine();
                System.out.print("Masukkan Grup Baru: ");
                idol.grup = scanner.nextLine();
                System.out.println("Data idol berhasil diperbarui!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }

    static void hapusIdol() {
        System.out.print("Masukkan ID Idol yang ingin dihapus: ");
        String id = scanner.nextLine();

        for (int i = 0; i < daftarIdol.size(); i++) {
            if (daftarIdol.get(i).id.equals(id)) {
                daftarIdol.remove(i);
                System.out.println("Idol berhasil dihapus!");
                return;
            }
        }
        System.out.println("ID tidak ditemukan.");
    }
}