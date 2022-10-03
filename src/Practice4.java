import java.util.Scanner;

public class Practice4 {
    public static void main(String[] args) {
        System.out.println("請輸入兩個數字");
        int num1;
        int num2;

        Scanner scanner= new Scanner(System.in);
        num1= scanner.nextInt();
        num2= scanner.nextInt();

        if(num1==num2){
            System.out.println("一樣大");
        } else if (num1<num2){
            System.out.println(num1+"<"+num2);
        }else if(num1>num2){
            System.out.println(num1+">"+num2);
        }

    }

}
