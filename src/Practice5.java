import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {
        System.out.println("請輸入一個數字");
        int a = 0;

        Scanner scanner= new Scanner(System.in);
        a= scanner.nextInt();

        if (a>=0&&a<=10)
        {
            System.out.println("true");
        }else
            System.out.println("false");
    }

}
