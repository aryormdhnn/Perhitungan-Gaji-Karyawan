public class Gaji {
    public static void main (String [] args)
    {
        Karyawan ref;
        Karyawan pekerja=new Karyawantetap();
        Karyawan karyawankontrak=new Freelance();
        Karyawan atasan=new Manager();

        System.out.println ("DAFTAR GAJI KARYAWAN");

        ref = pekerja;
        ref.setNama ("Fauziah");
        ref.getNama();
        ref.Jabatan();
        ref.TotalGaji();
        System.out.println ("\n");

        ref = karyawankontrak;
        ref.setNama ("Aryo");
        ref.getNama();
        ref.Jabatan();
        ref.TotalGaji();
        System.out.println ("\n");

        ref = atasan;
        ref.setNama ("Roma");
        ref.getNama();
        ref.Jabatan();
        ref.TotalGaji();
        System.out.println ("\n");
    }
}