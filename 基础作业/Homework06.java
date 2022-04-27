import java.util.Scanner;

public class Homework06 {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入要打印的等腰三角形行数");
        int num1 = myScanner.nextInt();//num1代表行数
        for (int i = 1; i <= num1; i++) {
            for(int k = 1; k <= num1 - i;k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= 2*i-1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
//【嵌套for循环】打印下列图案（等腰三角形）
//输入要打印的等腰三角形行数：10
/*
          *
         ***
        *****
       *******
      *********
     ***********
    *************
   ***************
  *****************
 *******************
*********************
 */
//要求：根据键盘录入的行数，决定等腰三角形的行数
