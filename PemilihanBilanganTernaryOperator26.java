import java.util.Scanner;
public class PemilihanBilanganTernaryOperator26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah angka: ");
        int angka = sc.nextInt();
        String hasil;

        hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";

        System.out.println("Angka " + angka + " adalah termasuk bilangan " + hasil);

    }
}