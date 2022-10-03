import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        System.out.println("請輸入一個數字");
        int num1;
        int num2;
        int a = 0;

        Scanner scanner= new Scanner(System.in);
        a= scanner.nextInt();
        num1 = a + 5;
        num2=a - 5;
        System.out.println(num1);
        System.out.println(num2);

    }
}
