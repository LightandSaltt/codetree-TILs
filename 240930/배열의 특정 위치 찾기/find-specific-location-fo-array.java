import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 배열 입력 받기
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;  // 짝수 번째 원소 합
        int third_sum = 0;  // 3의 배수 번째 원소 합
        int cnt = 0;  // 3의 배수 번째 원소 개수

        // 배열 순회
        for (int i = 0; i < 10; i++) {
            // 짝수 번째 원소 (인덱스는 0부터 시작하므로 i가 홀수인 경우가 짝수 번째)
            if ((i + 1) % 2 == 0) {
                sum += arr[i];
            }
            // 3의 배수 번째 원소 (인덱스는 0부터 시작하므로 i+1이 3의 배수)
            if ((i + 1) % 3 == 0) {
                third_sum += arr[i];
                cnt++;
            }
        }

        // 출력
        System.out.print(sum + " ");
        if (cnt > 0) {
            // 3의 배수 번째 원소의 평균 출력
            double third_avg = (double) third_sum / cnt;
            System.out.printf("%.1f", third_avg);
        } else {
            System.out.println("0.0");
        }
    }
}