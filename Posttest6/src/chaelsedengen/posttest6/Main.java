package chaelsedengen.posttest6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DataManager dm = new DataManager();
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n==== SISTEM DATA IDOL K-POP ====");
            System.out.println("1. Tambah Idol");
            System.out.println("2. Tampilkan Semua Idol");
            System.out.println("3. Ubah Data Idol");
            System.out.println("4. Lihat Jumlah Idol");
            System.out.println("5. Keluar");
            System.out.print("Pilih: ");

            try {
                pilihan = Integer.parseInt(sc.nextLine());

                switch (pilihan) {
                    case 1 -> dm.tambahIdol();
                    case 2 -> dm.tampilkanIdol();
                    case 3 -> dm.ubahIdol();
                    case 4 -> dm.tampilkanJumlahIdol();
                    case 5 -> System.out.println("Program selesai.");
                    default -> System.out.println("Pilihan tidak valid.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Input harus berupa angka.");
                pilihan = 0;
            }

        } while (pilihan != 5);
    }
}