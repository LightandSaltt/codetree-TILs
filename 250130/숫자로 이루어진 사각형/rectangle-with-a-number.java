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
    
    // n x n 크기의 숫자로 이루어진 사각형을 출력하는 함수
    public static void printSquare(int n) {
        int start = 1; // 시작 숫자
        
        for (int i = 0; i < n; i++) { // 🔹 n번 반복 → n x n 정사각형
            start = printRow(n, start);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printSquare(n); // n x n 사각형 출력
    }
}