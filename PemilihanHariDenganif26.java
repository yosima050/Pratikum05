import java.util.Scanner;
public class PemilihanHariDenganif26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number, dayType;

        System.out.println("Input Number");
        number = sc.nextInt();

        if ( number >= 1 && number <= 5) {
            System.out.println("Weekday");
        } else if (number >= 6 && number <=7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid Number");
        }
    }
    
}