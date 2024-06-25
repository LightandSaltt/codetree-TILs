import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = sc.nextInt();
        int d = sc.nextInt();

        if (a > c) {
            System.out.println("A");
        } else if (c > a) {
            System.out.println("B");
        } else if (a == c && b > d) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}