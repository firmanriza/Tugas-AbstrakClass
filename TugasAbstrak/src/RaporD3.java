public class RaporD3 extends RaporMahasiswa{
    public String LaporanMagang;
    @Override
    public void Penilaian() {
        System.out.println("Penilaian Rapor D3");
    }
    @Override
    public void KelulusanNilai() {
        System.out.println("Cara Kelulusan Nilai untuk D3");
        super.KelulusanNilai();
    }   

}