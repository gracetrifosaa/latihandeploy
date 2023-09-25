import java.util.Scanner;

public class Main {
    public static int devide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Tidak dapat melakukan pembagian");
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        try {
            // potensial untuk menghasilkan eksepsi
            int hasilPembagian = devide(10, 2);
            System.out.println("Hasil pembagian : " + hasilPembagian);
        } catch (ArithmeticException e) {
            // Menangani eksepsi jika terjadi ArithmeticException (pembagian oleh nol)
            System.out.println("Terjadi kesalahan aritmatika: " + e.getMessage());
        } finally {
//      // Blok finally akan selalu dieksekusi, baik eksepsi terjadi atau tidak
//      System.out.println("Selesai.");
//
        }
    }
}

