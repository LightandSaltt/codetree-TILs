public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;
        int temp;
        int temp2;
        int temp3;

        temp = a; // temp = 5
        temp2 = b; // temp2 = 6
        temp3 = c; // temp3 = 7
        b = a; // b = 5
        c = temp2;
        a = temp3;

        System.out.printf("%d\n%d\n%d", a, b, c);
    }
}