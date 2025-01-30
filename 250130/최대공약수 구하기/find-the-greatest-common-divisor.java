import java.util.Scanner;

public class Main {

    public static int gcd(int n, int m) {
        while (m != 0) {
            int temp = m;
            m = n % m;
            n = temp;
        }
        return n; // 최대공약수 반환
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(gcd(n, m)); // 결과 출력
    }
}
