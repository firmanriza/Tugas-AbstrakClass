public abstract class RaporMahasiswa {
        public String Nama;
        public String NIM;
        public String Fakultas;
        public String Jurusan;
        public String Kelas;
        public String Semester;
        public String Ipk;
        
        public void KelulusanNilai(){
            System.out.println("Kelulusan Nilai Umum");
        }

        public abstract void Penilaian();
        
        public int Penilaianint(int a, int b) {
            return a + b;
        }
    
        public double Penilaiandouble(double d, double e) {
            return d + e;
        }
}
