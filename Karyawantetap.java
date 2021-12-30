//ini merupakan inheritance atau turunan dari class karyawan//

public class Karyawantetap extends Karyawan{

   private int UangMakan;
    private int TunjanganKinerja;

    public Karyawantetap(){
        Jabatan="Karyawan Tetap";
        UangMakan=150000;
        TunjanganKinerja=150000;
        GajiPokok=1600000;
    }

    public int GajiPokok() {
            return GajiPokok;
    }

    public int TotalGaji() {
             int potongan;
        GajiKotor=GajiPokok+UangMakan+TunjanganKinerja;
        potongan= (int) (GajiKotor*0.2);
        TotalGaji=GajiKotor-potongan;

        System.out.println ("Gaji Pokok : " +GajiPokok);
        System.out.println ("Uang Makan : " +UangMakan);
        System.out.println ("Tunjangan Kinerja : " +TunjanganKinerja);
        System.out.println ("Gaji Kotor : " +GajiKotor);
        System.out.println ("Potongan : " +potongan);
        System.out.println ("Gaji Bersih : " +TotalGaji);

        return TotalGaji;
    }
}
