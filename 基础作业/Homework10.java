import java.util.Scanner;

public class Homework10 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("请输入一个整数：");
        long num = input.nextLong();
        long num1 = num;
        int count = 0;
        long a = 0;
        System.out.print(num1 + "的倒序输出为：");
        while (num != 0) {
            a = num % 10;
            System.out.print(a);
            count++;
            num/=10;
        }
        System.out.println("\n" + num1 + "的位数为：" + count);
    }
}
//【根据输入求输出】键盘录入一个正整数，请求：1.它是几位数？
// 2.逆序打印出各位数字。