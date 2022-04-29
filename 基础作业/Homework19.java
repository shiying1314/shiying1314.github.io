import java.util.Scanner;

public class Homework19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num = sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num + "是偶数");
        }else{
            System.out.println(num + "是奇数");
        }
    }
}
//【判断奇偶数】键盘录入一个in数字，判断输出它是奇数还是偶数。