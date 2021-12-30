public class Freelance extends Karyawan{
    private int UangMakan;


    public Freelance(){
        Jabatan="Freelance";
        UangMakan=125000;
        GajiPokok=1500000;
    }
    public int GajiPokok(){
        return GajiPokok;
    }

    public int TotalGaji() {
        int potongan;
        GajiKotor=GajiPokok+UangMakan;
        potongan= (int) (GajiKotor*0.1);
        TotalGaji=GajiKotor-potongan;

        System.out.println ("Gaji Pokok : " +GajiPokok);
        System.out.println ("Uang Makan : " +UangMakan);
        System.out.println ("Gaji Kotor : " +GajiKotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +TotalGaji);

        return TotalGaji;
    }
}
