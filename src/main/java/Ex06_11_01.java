import java.util.Scanner;

public class Ex06_11_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int hap = 0;
        int i;
        int num1, num2, num3;

        //시작값이 끝보다 큰 수가 들어오면, "시작값이 끝수보다 큽니다."
        //for문 실행이 안되게..

        System.out.printf("값 입력 : ");
        num1 = s.nextInt(); //5
        System.out.printf("끝값 입력 : ");
        num2 = s.nextInt(); //5
        System.out.printf("증가값 입력 : ");
        num3 = s.nextInt();

        if (num1 >= num2) { //시작값이 큰 경우
            System.out.printf("시작값이 끝수보다 큽니다.");
        } else {
            for (i = num1; i <= num2; i = i + num3) {
                hap = hap + i;
            }
            System.out.printf(" %d에서 %d까지 %d씩 증가한 값의 합 : %d\n", num1, num2, num3, hap);
        }
    }
}


