import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka;
        
        do {
            System.out.print("\nMasukkan input N (nilai N minimal 3): ");
            angka = sc.nextInt();

            if (angka >= 3) {
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
            } else if (angka > 0 && angka <3) {
                System.out.println("ANGKA DI BAWAH 3, SILAHKAN INPUT ULANG ANGKA !!!");
            } else {
                System.out.println("SISTEM BERHENTI !!!");
            }
        } while (angka != 0);
    }
}
