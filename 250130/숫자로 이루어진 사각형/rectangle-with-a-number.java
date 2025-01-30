import java.util.Scanner;

public class Main {
    
    // 한 줄을 출력하는 함수
    public static int printRow(int n, int start) {
        int num = start;
        
        for (int i = 0; i < n; i++) {
            System.out.print(num + " ");
            num++; // 숫자 증가
            
            if (num > 9) { // 9 초과하면 1로 초기화
                num = 1;
            }
        }
        
        System.out.println(); // 개행
        
        return num; // 다음 줄의 시작 숫자 반환
    }
    
    // 전체 사각형을 출력하는 함수
    public static void printSquare(int n) {
        int start = 1; // 시작 숫자
        
        for (int i = 0; i < 4; i++) {
            start = printRow(n, start); // 각 행을 출력하고 다음 시작 숫자 업데이트
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n); // 전체 사각형 출력
    }
}
