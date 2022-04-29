import java.util.Scanner;

public class Homework12 {
    public static void main(String[] args)
    {
        System.out.println("输入0--10000内的数字求和");
        Scanner in = new Scanner(System.in);
        int sum = 0;
        double n;
        n = in.nextLong();
        while(n > 10000 || n < 0)
        {
            System.out.print("输入0--10000以内的数字");
            n = in.nextLong();
        }
        for(int i = 0;i <= n; ++i) {
            sum += i;
        }//这里可不加大括号，不加大括号默认循环语句为一句
        System.out.println(sum);
    }
}
//【累加】求前n个数的和，其中n>0。