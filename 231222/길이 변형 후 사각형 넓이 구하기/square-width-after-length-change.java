import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a += 8;
        b *= 3;
        int res = a * b;
        System.out.println(a + "\n" + b + "\n" + res);
    }
}