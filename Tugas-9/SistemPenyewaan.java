import java.util.*;

public class SistemPenyewaan {
    private static List<Kendaraan> daftarKendaraan = new ArrayList<>();
    private static List<Penyewa> daftarPenyewa = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        daftarKendaraan.add(new Mobil("Toyota", "Fortuner", 2022, 4));
        daftarKendaraan.add(new Mobil("Honda", "HR-V", 2023, 4));
        daftarKendaraan.add(new Motor("Yamaha", "Aerox", 2021, 2));
        daftarKendaraan.add(new Sepeda("Polygon", "Monarch M3", 2020, "Gunung"));

        int pilihan;
        do {
            System.out.println("\n=== RENTAL KENDARAAN ===");
            System.out.println("=== MENU ===");
            System.out.println("1. Lihat Kendaraan Tersedia");
            System.out.println("2. Lihat Kendaraan Sedang Disewa");
            System.out.println("3. Sewa Kendaraan");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1 -> tampilkanKendaraan(false);
                case 2 -> tampilkanKendaraan(true);
                case 3 -> sewaKendaraan();
                case 0 -> System.out.println("Keluar dari aplikasi...");
                default -> System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
    }

    private static void tampilkanKendaraan(boolean disewa) {
    System.out.println("\n=== KENDARAAN " + (disewa ? "SEDANG DISEWA" : "TERSEDIA") + " ===");
    int i = 0;
    for (Kendaraan k : daftarKendaraan) {
        if (k.isDisewa() == disewa) {
            System.out.println("No: " + i);
            k.tampilInfo();
            System.out.println("----------------------");
        }
        i++;
    }
}


    private static void sewaKendaraan() {
        System.out.print("Masukkan nama penyewa: ");
        String nama = sc.nextLine();

        tampilkanKendaraan(false);
        System.out.print("Pilih nomor kendaraan yang ingin disewa: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 0 && index < daftarKendaraan.size()) {
            Kendaraan k = daftarKendaraan.get(index);
            if (!k.isDisewa()) {
                k.sewa();
                Penyewa p = new Penyewa(nama, k);
                daftarPenyewa.add(p);
                System.out.println("Kendaraan berhasil disewa oleh " + nama + ".");
            } else {
                System.out.println("Kendaraan sudah disewa!");
            }
        } else {
            System.out.println("Nomor kendaraan tidak valid.");
        }
    }
}
