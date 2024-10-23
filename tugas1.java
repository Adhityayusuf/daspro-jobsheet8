import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        System.out.print("Masukkan input N (nilai N minimal 3): ");
        angka = sc.nextInt();

        for (int i = 1;i <= angka; i++) {
            if (i == 1 || i == angka) {
                for (int j = 1; j <= angka; j++) {
                System.out.print(angka);
                }
            } else {
                System.out.print(angka);
                for (int j = 1; j <= angka - 2; j++) {
                    System.out.print(" ");
                }
                System.out.print(angka);
            }
            System.out.println();
        }
    }
}
