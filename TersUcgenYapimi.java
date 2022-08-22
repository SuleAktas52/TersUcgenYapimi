import java.util.Scanner;

public class TersUcgenYapimi {
    public static void main(String[] args) {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz :");
        int n = klavye.nextInt();
        for (int i = n; i >= 1; i--) {

            for (int j =0; j <= (n-i); j++) {
                System.out.print(" ");
            }
            for (int k = (2 * i - 1); k >= 1; k--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
