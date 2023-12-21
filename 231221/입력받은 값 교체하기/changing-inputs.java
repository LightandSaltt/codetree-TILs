import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        a = sc.nextInt(); // 14
        b = sc.nextInt(); // 5
        c = a; // 14
        a = b; // 5
        b = c; // 14

        System.out.printf("%d %d", a, b);
    }
}