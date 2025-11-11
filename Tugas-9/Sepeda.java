public class Sepeda extends Kendaraan {
    private String jenisSepeda;

    public Sepeda(String merk, String model, int tahunProduksi, String jenisSepeda) {
        super(merk, model, tahunProduksi, "Sepeda");
        this.jenisSepeda = jenisSepeda;
    }

    @Override
    public void tampilInfo() {
        System.out.println("=== INFORMASI SEPEDA ===");
        super.tampilInfo();
        System.out.println("Jenis Sepeda: " + jenisSepeda);
    }
}
