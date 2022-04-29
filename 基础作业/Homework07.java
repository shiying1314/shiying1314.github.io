public class Homework07 {
    public static void main(String[] args) {
        int num1 = 9;//num1代表行数
        for (int i = 1; i <= num1; i++) {//i代表当前行数
            for(int k = 1; k <= i;k++){
                System.out.print(k + "*" + i + "=" + (k*i) + "\t");
            }
            System.out.print("\n");
        }
    }
}
//【嵌套for循环】打印九九乘法表。（和题6基本一样）