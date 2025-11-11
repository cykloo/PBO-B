public class Kendaraan {
    private String merk;
    private String model;
    private int tahunProduksi;
    private boolean disewa;
    private String jenis;

    public Kendaraan(String merk, String model, int tahunProduksi, String jenis) {
        this.merk = merk;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.disewa = false;
        this.jenis = jenis;
    }

    public String getMerk() { return merk; }
    public String getModel() { return model; }
    public int getTahunProduksi() { return tahunProduksi; }
    public boolean isDisewa() { return disewa; }
    public String getJenis() { return jenis; }

    public void sewa() { disewa = true; }
    public void kembalikan() { disewa = false; }

    public void tampilInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Model: " + model);
        System.out.println("Tahun Produksi: " + tahunProduksi);
        System.out.println("Status: " + (disewa ? "Disewa" : "Tersedia"));
        System.out.println("Jenis: " + jenis);
    }
}
