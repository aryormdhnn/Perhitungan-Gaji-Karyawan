public abstract class Karyawan {
    private String Nama;
    String Jabatan;
    int TotalGaji;
    int GajiKotor;
    int GajiPokok;
    int UangMakan;

    public abstract int GajiPokok();
        public void setNama(String Nama){
            this.Nama=Nama;
    }

    public void Jabatan() {
    }
        public void Freelance() {
        }

    public String getNama() {
        System.out.println("Nama Karyawan:" + Nama);
            return Nama;
    }

    public String getJabatan() {
        System.out.println("Posisi Jabatan" + Jabatan);
            return Jabatan;
    }

    public abstract int TotalGaji();

}