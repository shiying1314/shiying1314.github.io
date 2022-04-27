public class Homework01 {
    public static void main(String[] args){
        int num2 =0;
        for(int num1 = 10000; num1 <=99999;num1++){
            if(num1 / 10000 == num1 % 10 && (num1 / 1000) % 10 == (num1 / 10 ) % 10){
                System.out.print(num1 + "\t");
                num2++;
                if(num2 % 10 == 0){
                    System.out.print("\n");
                }
            }
        }
        System.out.print("所有五位数中一共有" + num2 + "个回文数");
    }
}
//【回文数】打印5位数中的所有回文数，每行打印10个数。最后统计一下一共有多少个5位回文数。
//注：回文数即正反读都是一个数，5位数的话，只要个位与万位相同，十位与千位相同就是一个回文数。