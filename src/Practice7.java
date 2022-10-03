import java.util.Scanner;

public class Practice7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("請輸入數字");
        int i;
        i= scanner.nextInt();

        if (i>=0 && i<=9){
            System.out.println("個位數");
        }
        else if (i<0 && i>=-9){
            System.out.println("個位數");
        }
        else if (i>9&& i<100){
            System.out.println("十位數");
        }
        else if (i<-9&& i>-100) {
            System.out.println("十位數");
        }
        else if (i>=100 && i<=999){
            System.out.println("百位數");
        }
        else if (i<=-100 && i>=-999){
            System.out.println("百位數");
        }
    }
}
