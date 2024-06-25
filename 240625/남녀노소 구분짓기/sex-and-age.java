import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String sex = sc.next();

        if (a == 0) {
            if (sex >= 19) {
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        } else {
            if (sex >= 19) {
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}