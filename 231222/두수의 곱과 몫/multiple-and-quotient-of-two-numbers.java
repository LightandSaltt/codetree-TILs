import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int mul = a * b;
        int div = a / b;
        System.out.println(a + " * " + b + " = " + mul);
        System.out.println(a + " / " + b + " = " + div);
    }
}