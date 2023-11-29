public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        int mi = 160934;

        double fir = 9.2;
        double sec = 1.3;

        double fir_ft = fir * ft;
        double sec_mi = sec * mi;

        System.out.printf("9.2ft = %.1fcm\n", fir_ft);
        System.out.printf("1.3mi = %.1fcm", sec_mi);
    }
}