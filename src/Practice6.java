import java.util.Scanner;

public class Practice6 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("請輸入數字");
        int i;
        i= scanner.nextInt();

        switch(i){
            case 1:
                System.out.println("請拼命加油吧");
                break;

            case 2:
                System.out.println("請再加油一點");
                break;

            case 3:
                System.out.println("您還可以做得更好");
                break;
            case 4:
                System.out.println("幹得好");
                break;

            case 5:
                System.out.println("您真是太優秀了");
                break;

        }
    }
}
