import java.util.Scanner;

public class Homework21 {
    public static void main(String[] args) {
        System.out.print("请输入正整数x的值");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();//获取x的数值
        System.out.print("请输入正整数y的值");
        int y = scanner.nextInt();//获取y的数值
        System.out.print("请输入正整数z的值");
        int z = scanner.nextInt();//获取z的数值
        if(x >= y){
            if(y >= z){
                System.out.print(z + "\t" + y + "\t" + x);
            }else if(x >= z){
                System.out.print(y + "\t" + z + "\t" + x);
            }else{
                System.out.print(y + "\t" + x + "\t" + z);
            }
        }else{
            if(x >= z){
                System.out.print(y + "\t" + x + "\t" + z);
            }else if(y >= z){
                System.out.print(x + "\t" + z + "\t" + y);
            }else{
                System.out.print(x + "\t" + y + "\t" + z);
            }
        }
    }
}
//【排序】键盘输入三个整数x、y、z，请把这三个数由小到大输出。