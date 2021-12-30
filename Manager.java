public class Manager extends Karyawan {
    private int TunjanganKinerja;
    private int TunjanganJabatan;
    private int UangMakan;

    public Manager(){
        Jabatan="Manager";
        TunjanganJabatan=1500000;
        TunjanganKinerja=1000000;
        UangMakan=250000;
        GajiPokok=5000000;
    }
    public int GajiPokok(){
        return GajiPokok;
    }

    public int TotalGaji() {
        int potongan;
        GajiKotor=GajiPokok+UangMakan+TunjanganKinerja+TunjanganJabatan;
        potongan= (int) (GajiKotor*0.2);
        TotalGaji=GajiKotor-potongan;

        System.out.println ("Gaji Pokok : " +GajiPokok);
        System.out.println ("Uang Makan : " +UangMakan);
        System.out.println ("Tunjangan Kinerja : " +TunjanganKinerja);
        System.out.println ("Tunjangan Jabatan : " +TunjanganJabatan);
        System.out.println ("Gaji Kotor : " +GajiKotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +TotalGaji);

        return TotalGaji;
    }
}
