package chaelsedengen.posttest6;

import java.util.ArrayList;
import java.util.Scanner;

public class DataManager {
    private ArrayList<Idol> daftarIdol = new ArrayList<>();
    private Scanner input = new Scanner(System.in);

    public void tambahIdol() {
        try {
            System.out.print("Masukkan nama idol: ");
            String nama = input.nextLine();
            System.out.print("Masukkan grup idol: ");
            String grup = input.nextLine();
            daftarIdol.add(new Idol(nama, grup));
            System.out.println("Idol berhasil ditambahkan.");
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan input: " + e.getMessage());
        }
    }

    public void tampilkanIdol() {
        if (daftarIdol.isEmpty()) {
            System.out.println("Belum ada data idol.");
        } else {
            for (Idol i : daftarIdol) {
                i.tampilkanData();
            }
        }
    }

    public void ubahIdol() {
        try {
            System.out.print("Masukkan nama idol yang ingin diubah: ");
            String namaCari = input.nextLine();
            boolean ditemukan = false;

            for (Idol i : daftarIdol) {
                if (i.getNama().equalsIgnoreCase(namaCari)) {
                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = input.nextLine();
                    System.out.print("Masukkan grup baru: ");
                    String grupBaru = input.nextLine();
                    i.updateData(namaBaru, grupBaru);
                    System.out.println("Data berhasil diubah.");
                    ditemukan = true;
                    break;
                }
            }

            if (!ditemukan) {
                System.out.println("Data idol tidak ditemukan.");
            }
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    public void tampilkanJumlahIdol() {
        System.out.println("Jumlah total idol: " + Idol.getJumlahIdol());
    }
}