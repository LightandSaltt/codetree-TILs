import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int min;

        if (a > b && c > b) {
            min = b;
        } else if (b > a && c > a) {
            min = a;
        } else {
            min = c;
        }

        if (a == c && a == b) {
            System.out.println("1 0");
        } else if (a == min){
            System.out.println("1 0");
        }
        else {
            System.out.println("1 0");
        }
    }
}