package chaelsedengen.posttest5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Idol> daftarIdol = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN DATA IDOL K-POP ===");
            System.out.println("1. Tambah Data Idol");
            System.out.println("2. Lihat Data Idol");
            System.out.println("3. Tambah Fans");
            System.out.println("4. Lihat Hak Akses Admin");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = input.nextInt();
            input.nextLine(); // Buang newline

            switch (pilihan) {
                case 1:
                    tambahIdol();
                    break;
                case 2:
                    lihatIdol();
                    break;
                case 3:
                    tambahFans();
                    break;
                case 4:
                    lihatHakAksesAdmin();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    static void tambahIdol() {
        System.out.print("Nama Idol     : ");
        String nama = input.nextLine();
        System.out.print("Tanggal Lahir : ");
        String tgl = input.nextLine();
        System.out.print("Grup          : ");
        String grup = input.nextLine();
        System.out.print("Agensi        : ");
        String agensi = input.nextLine();

        Idol idol = new Idol(nama, tgl, grup, agensi);
        daftarIdol.add(idol);
        System.out.println("✅ Idol berhasil ditambahkan!");
    }

    static void lihatIdol() {
        if (daftarIdol.isEmpty()) {
            System.out.println("📭 Belum ada data idol.");
        } else {
            System.out.println("\n--- Daftar Idol ---");
            for (Idol i : daftarIdol) {
                i.tampilkanData(true);
                System.out.println();
            }
        }
    }

    static void tambahFans() {
        System.out.print("ID Fans  : ");
        String id = input.nextLine();
        System.out.print("Nama     : ");
        String nama = input.nextLine();
        System.out.print("Email    : ");
        String email = input.nextLine();

        Fans fans = new Fans(id, nama, email);
        fans.tampilkanIdentitas();
        System.out.println("✅ Data fans ditampilkan (karena class final tidak bisa disimpan dalam list dengan ekstensi lebih lanjut).");
    }

    static void lihatHakAksesAdmin() {
        Admin admin = new Admin("admin", "admin123");
        admin.tampilkanHakAkses();
    }
}