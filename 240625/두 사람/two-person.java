import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        String a_sex = sc.nextLine();

        int b = sc.nextInt();
        String b_sex = sc.nextLine();

        if ((a >= 19 && b >= 19) && (a_sex == "M" || b_sex == "M")) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}