import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        int a_t = sc.nextInt();

        String b = sc.next();
        int b_t = sc.nextInt();

        String c = sc.next();
        int c_t = sc.nextInt();

        int count = 0;

        if (a.equals("Y")) {
            if (a_t >= 37) {
                count ++;
            }
        } else if (b.equals("Y")) {
            if (b_t >= 37) {
                 count ++;
                }
        } else if (c.equals("Y")) {
            if (c_t >= 37) {
                count ++;
            }
        }
        
        if (count >= 2) {
                System.out.println("E");
            } else {
                System.out.println("N");
            }
    } 

}