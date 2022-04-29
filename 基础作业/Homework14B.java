import java.util.Scanner;

public class Homework14B {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println(" 请输入第一个值");
        int a = num.nextInt();
        System.out.println(" 请输入第二个值");
        int b = num.nextInt();
        System.out.println(" 请输入第三个值");
        int c = num.nextInt();
        if (a >= b) {
            if (a >= c) {
                System.out.println("最大值为" + a);
            } else {
                System.out.println("最大值为" + c);
            }
        } else {
            if(b >= c){
                System.out.println("最大值为" + b);
            }else{
                System.out.println("最大值为" + c);
            }
        }
    }
}
//求最大值】分别用if和三目运算符求三个数的最大值。比较一下两种方式，哪种比较好？
//if