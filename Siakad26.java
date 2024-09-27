import java.util.Scanner;

public class Siakad26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        String kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;
        String nilaiHuruf = "";
        String Kualifikasi = "";

        System.out.print("Masukkan nama: ");
        nama = sc.nextLine();
        System.out.print("Masukkan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        kelas = sc.nextLine();
        System.out.print("Masukkan Nomor Absen: ");
        absen = sc.nextByte();

        System.out.print("Masukkan Nilai Kuis: ");
        nilaiKuis = sc.nextDouble();
        
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas = sc.nextDouble();

        System.out.print("Masukkan Nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20 + nilaiTugas * 0.30 + nilaiUjian * 0.50 );

        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            Kualifikasi = "Sangat Baik";
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            Kualifikasi = "Lebih dari Baik";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            Kualifikasi = "Baik";
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            Kualifikasi = "Lebih dari Cukup";
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60 ) {
            nilaiHuruf = "C";
            Kualifikasi = "Cukup";
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "C";
            Kualifikasi = "Kurang";
        } else {
            nilaiHuruf = "E";
            Kualifikasi = "Gagal";
        }

        System.out.println("Nama Mahasiswa: " + nama + " NIM: " + nim);
        System.out.println("Kelas: " + kelas + " Absen: " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        System.out.println("Nilai Akhir Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + Kualifikasi);
    }
}