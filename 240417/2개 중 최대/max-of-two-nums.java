import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, n;
        a = sc.nextInt();
        b = sc.nextInt();

        n = a > b ? a : b;

        System.out.println(n);
    }
}