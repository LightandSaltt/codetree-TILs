import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int plus = a + b;
        int minus = a - b;
        double div = (double) plus / minus;
        System.out.printf("%.2f", div);
    }
}