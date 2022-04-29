import java.util.Scanner;

public class Homework26 {
    public static void main(String[] args) {
        System.out.print("请任意输入一个正整数");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;
        while(num !=0){
            sum = sum + num % 10;
            num = num / 10;
        }
        System.out.println(sum);
    }
}
//【键盘录入】键盘输入任意一个正整数，求各位数字之和。