import java.util.Scanner;

public class Homework20 {
    public static void main(String[] args) {
        System.out.print("请输入一个你要分解的正整数：");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();//获取输入的数字
        System.out.println();
        System.out.print(input + "=");
        for (int i = 2; i < input + 1; i++) {
            while(input % i == 0 && input != i) {
                input = input / i;
                System.out.print(i + "*");
            }
            if(input == i){//上面的都不能整除，说明这是一个质数
                System.out.print(i);
                break;
            }
        }
        scanner.close();
    }
}
//【分解质因数】将一个大于2的正整数分解质因数。例如：输入3的话，输出 3=3； 输入6，输出6 = 2 *3等。