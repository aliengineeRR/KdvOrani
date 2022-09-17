import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tutarını Giriniz: ");
        double tutar = input.nextDouble();
        if (tutar > 1000.0D) {
            tutar += tutar * 0.18D;
        } else {
            tutar += tutar * 0.08D;
        }

        System.out.println("Geri ödenecek tutar :" + tutar);
    }
}
