import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("-");
        int x = sc.nextInt();
        int z = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("0" + x + "-" + y + "-" + z);
    }
}