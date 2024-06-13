import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        if (1.0 <= a && 1.0 <= b) {
            System.out.println("High");
        } else if (0.5 <= a && 0.5 <= b){

        }
        else {
            System.out.println("Low");
        }
    }
}