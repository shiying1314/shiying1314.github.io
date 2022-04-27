public class Homework05 {
    public static void main(String[] args) {
        int i = 0;
        for (int figure = 101; figure <= 200; figure++) {
            for (int num1 = 2; num1 < figure && figure % num1 != 0; num1++) {
                if (figure == num1 +1) {
                    System.out.println(figure);
                    i++;
                }
            }
        }
        System.out.println("101-200之间有" + i + "个素数");
    }
}
//【求素数】判断101-200之间有多少个素数，并输出其中所有素数。
//注：素数即是除了1和它本身以外不再有其他因数的自然数。
// 程序中可以用这个数，遍历除以2到这个数减去1。如果能够被整除，则表明此数不是素数，反之是素数。