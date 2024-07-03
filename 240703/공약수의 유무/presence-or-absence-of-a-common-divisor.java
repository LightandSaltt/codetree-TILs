import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int cnt = 0;

        for (int i = a; a >= b; i++) {
            if (i % 1920 == 0 && i % 2880) {
                cnt++;
            }
        }
        if (cnt != 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }


    }
}