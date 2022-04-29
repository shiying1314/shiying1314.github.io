import java.util.Scanner;

public class Homework18 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int num1 = sc.nextInt();
        int num2 = num1;
        int count = 0;
        if(num1 % 9 == 0){
            for(int i = 0; num1 % 9 == 0; i++){
                num1 = num1 / 9;
                count++;
            }
            System.out.println(num2 + "能被" + count + "个9整除");
        }else{
            System.out.println(num2 + "不能被9整除");
        }
    }
}
//【被9整除】键盘录入一个数，请判断它数能被几个9整除 。如81就可以被2个9整除。