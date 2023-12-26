import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cm = sc.nextInt();
        int kg = sc.nextInt();
        double bmi = kg * 10000 / (cm * cm);

        if (bmi > 25) {
            System.out.printf("%.0f\n", bmi);
            System.out.println("Obesity");
        }
        else {
            System.out.println(bmi);
        }
    }
}