import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        System.out.println("請輸入三角形底和高");
        int a;
        int b;
        float area;
        Scanner scanner= new Scanner(System.in);
        a= scanner.nextInt();
        b= scanner.nextInt();
        area= (a*b)/2;
        System.out.println(area);

    }
}
