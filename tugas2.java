import java.util.Scanner;
public class tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jmlKampus, jmlCabor;
        String Kampus, cabor, atlet;

        System.out.print("Input Jumlah Politeknik Yang Mendaftar : ");
        jmlKampus = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= jmlKampus; i++) {
            System.out.print("Nama Politeknik ke-" + i + " : ");
            Kampus = sc.nextLine();
            System.out.print("Jumlah Cabor : ");
            jmlCabor = sc.nextInt();
            sc.nextLine();

            for (int j = 1; j <= jmlCabor; j++) {
                System.out.print("\nNama Cabor ke-" + j + " : ");
                cabor = sc.nextLine();

                for (int k = 1; k <= 5; k++) {
                    System.out.print("Nama Atlet ke-" + k + " : ");
                    atlet = sc.nextLine();
                }
            }
            System.out.println();
        }
    }
}
