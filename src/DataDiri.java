import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class DataDiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // Input jenis kelamin
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.nextLine().charAt(0);
        String jenisKelaminLengkap = (jenisKelamin == 'L') ? "Laki-laki" : "Perempuan";

        // Input tanggal lahir
        System.out.print("Masukkan tanggal lahir (yyyy-MM-dd): ");
        String tanggalLahirString = scanner.nextLine();
        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirString);

        // Hitung umur
        LocalDate sekarang = LocalDate.now();
        Period period = Period.between(tanggalLahir, sekarang);
        int umur = period.getYears();

        // Output data diri
        System.out.println("\n=== Data Diri ===");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Tanggal Lahir: " + tanggalLahir);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }
}