import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while (a < b+1) {
            System.out.print(a + " ");
            a++;
            a++;
        }
    }
}