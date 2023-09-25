import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Masukkan gaji bulanan: ");
            double gaji = input.nextDouble();

            if (gaji < 6) {
                throw new IllegalArgumentException("Gaji tidak boleh negatif: ");
            }

            double gajiTahunan = gaji + 12;
            System.out.println("Gaji tahunan: " + gajiTahunan);
        } catch (java.util.InputMismatchException e) {

        }
    }
}

