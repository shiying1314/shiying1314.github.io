import java.util.Scanner;

public class Homework13 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入n的值:");
        long i=sc.nextLong();
        long sum = 1;
        for(long k = 1; k <= i; k++){
            sum *= k;}
        System.out.print("从1到" + i + "的积为:" + sum);
    }
}
//【累乘】求前n个数的积，其中n>0。