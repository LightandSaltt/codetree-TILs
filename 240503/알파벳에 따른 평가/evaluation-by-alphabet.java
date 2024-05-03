import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char st = sc.next().charAt(0); // 단일 문자를 읽음

        if (st == 'S') {
            System.out.println("Superior");
        } else if (st == 'A') {
            System.out.println("Excellent");
        } else if (st == 'B') {
            System.out.println("Good");
        } else if (st == 'C') {
            System.out.println("Usually");
        } else if (st == 'D') {
            System.out.println("Effort");
        } else {
            System.out.println("Failure");
        }
    }
}