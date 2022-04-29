import java.util.Scanner;

public class Homework31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入月份,月份数为正整数");
        int month = scanner.nextInt();
        Methods01 methods01 = new Methods01();
        int num = methods01.get(month);
        System.out.println("第" + month + "个月兔子的对数为" + num);
    }
}
class Methods01 {
    public int get(int i) {
        if (i == 1 || i == 2) {
            return 1;
        } else {
            return get(i - 1) + get(i - 2);
        }
    }
}
//【递归经典问题-不死神兔】有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子对数为多少？
// （其实就是斐波那契数列）