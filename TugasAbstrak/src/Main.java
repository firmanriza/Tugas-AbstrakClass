public class Main {
    public static void main(String[] args) {
        
        RaporD3 raporD3 = new RaporD3();
        RaporS1 raporS1 = new RaporS1();
        RaporS2 raporS2 = new RaporS2();

        raporD3.Penilaian();
        raporD3.KelulusanNilai();

        raporS1.Penilaian();
        raporS1.KelulusanNilai();

        raporS2.Penilaian();
        raporS2.KelulusanNilai();


        int Penilaian1 = raporD3.Penilaianint(3 ,4);
        double Penilaian2 = raporD3.Penilaiandouble(3.7 , 4.0);
        System.out.println("Penilaian 1 : " + Penilaian1);
        System.out.println("Penilaian 2 : " + Penilaian2);
    }
}
