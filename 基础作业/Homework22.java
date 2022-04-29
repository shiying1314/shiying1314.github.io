import java.util.Scanner;

public class Homework22 {
    public static void main(String[] args) {
        System.out.print("请输入正整数x的值");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//获取x的数值
        System.out.print("请输入正整数y的值");
        int y = scanner.nextInt();//获取y的数值
        int temp = x;
        x = y;
        y = temp;
        System.out.println(x + "\t" + y);
    }
}
//【交换值】任意给两个整数（int）值，请交互它们的值。