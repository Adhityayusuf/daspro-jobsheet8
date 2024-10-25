import java.util.Scanner;
public class RataNilai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, nilaiMhs, mahasiswa;
        float nilai, totalNilai, rataNilai;
        String nama;

        System.out.println("=== MENGHITUNG NILAI RATA-RATA MAHASISWA ===");
        System.out.print("\nJumlah Mahasiswa yg di input : ");
        mahasiswa = sc.nextInt();
        System.out.print("Jumlah Matkul yg di input    : ");
        nilai = sc.nextInt();

        i = 1;
        while (i <= mahasiswa) {
            System.out.println("\nInput Nilai Mahasiswa ke " + i);
            sc.nextLine();
            System.out.print("Input Nama Mahasiswa : ");
            nama = sc.nextLine();

            totalNilai = 0;
            for (j = 1; j <= nilai; j++) {
                System.out.print("Nilai ke-" + j + " = ");
                nilaiMhs = sc.nextInt();
                totalNilai += nilaiMhs;
            }

            rataNilai = totalNilai / nilai;
            System.out.println("Rata-rata Nilai Mahasiswa atas nama " + nama + " adalah " + rataNilai);
            i++;
        }
        System.out.println("\n===  PENGINPUTAN NILAI SELESAI  ===");
    }
}
