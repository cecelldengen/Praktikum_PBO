package chaelsedengen.posttest2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Idol> daftarIdol = new ArrayList<>();
    private static ArrayList<Grup> daftarGrup = new ArrayList<>();
    private static ArrayList<Album> daftarAlbum = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int pilihan;
        do {
            System.out.println("\n=== SISTEM MANAJEMEN DATA IDOL K-POP ===");
            System.out.println("1. Tambah Idol");
            System.out.println("2. Tambah Grup");
            System.out.println("3. Tambah Album");
            System.out.println("4. Tampilkan Semua Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahIdol();
                case 2 -> tambahGrup();
                case 3 -> tambahAlbum();
                case 4 -> tampilkanSemuaData();
                case 5 -> System.out.println("Terima kasih telah menggunakan sistem ini.");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 5);
    }

    private static void tambahIdol() {
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

    private static void tambahGrup() {
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

    private static void tambahAlbum() {
        System.out.print("Masukkan ID Album: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Nama Album: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan Tanggal Rilis: ");
        String tanggalRilis = scanner.nextLine();
        System.out.print("Masukkan Nama Grup: ");
        String grup = scanner.nextLine();

        daftarAlbum.add(new Album(id, nama, tanggalRilis, grup));
        System.out.println("Album berhasil ditambahkan!");
    }

    private static void tampilkanSemuaData() {
        daftarIdol.forEach(Idol::tampilkanData);
        daftarGrup.forEach(Grup::tampilkanData);
        daftarAlbum.forEach(Album::tampilkanData);
    }
}