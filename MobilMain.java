package Modul_4;

import java.util.Scanner;

public class MobilMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah mobil: ");
        int jumlahMobil = scanner.nextInt();
        scanner.nextLine();

        Mobil[] mbl = new Mobil[jumlahMobil];

        for (int i = 0; i < jumlahMobil; i++) {
            System.out.print("Merk mobil ke-" + (i + 1) + ": ");
            String merk = scanner.nextLine();
            System.out.print("Warna mobil ke-" + (i + 1) + ": ");
            String warna = scanner.nextLine();
            mbl[i] = new Mobil(merk, warna);
        }

        System.out.println("\nMerk dan Warna Mobil:");
        for (Mobil mobil : mbl) {
            System.out.println("Merk: " + mobil.getMerk());
            System.out.println("Warna: " + mobil.getWarna());
        }
    }
}
