import java.util.Scanner;

public class Homework28 {
    public static void main(String[] args) {
        System.out.print("请任意输入一个正整数");
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();
        double sum = 0;
        if(num % 2 == 0){
            for( int i = 2 ; i <= num ; i += 2){
                sum += 1.0 / i;
            }
            System.out.println("1/2+1/4+1/6+...+1/n的结果为" + sum);
        }else{
            for( int i = 1 ; i <= num ; i += 2){
                sum += 1.0 / i;
            }
            System.out.println("1/1+1/3+1/5+...+1/n的结果为" + sum);
        }
    }
}
//【分数累加】编写一个函数，输入n为偶数时，求1/2 + 1/4 +1/6 + ... + 1/n的结果；
// 当输入n为奇数时，求1/1 + 1/3 + 1/5 +... + 1/n 的结果。