public class Penyewa {
    private String nama;
    private Kendaraan kendaraan;

    public Penyewa(String nama, Kendaraan kendaraan) {
        this.nama = nama;
        this.kendaraan = kendaraan;
    }

    public String getNama() { return nama; }
    public Kendaraan getKendaraan() { return kendaraan; }

    public void tampilPenyewa() {
        System.out.println("Nama Penyewa: " + nama);
        kendaraan.tampilInfo();
    }
}
