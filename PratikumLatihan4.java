import java.util.Scanner;
public class PratikumLatihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Usia Anda");
        int usia = input.nextInt();

        if (usia < 0) {
            System.out.println("Usia Tidak Boleh Negatif");
            } else if (usia >= 0 && usia <= 12) {
            System.out.println("Kategori Anak");
            } else if (usia >= 13 && usia <=19 ) {
            System.out.println("Kategori Remaja");
            } else if (usia >= 20 && usia <=64) {
                System.out.println("Kategori Dewasa");
            } else if (usia >= 65) {
                System.out.println("Kategori Lansia");
            }
        else {
            System.out.println("Usia Tidak Valid");
        }
        }
    }