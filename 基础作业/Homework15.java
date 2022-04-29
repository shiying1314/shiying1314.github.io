public class Homework15 {
    public static void main(String[] args) {
        int num = 0;
        for(int i = 1; i <= 10000; i++){
            int x =(int) Math.sqrt(i + 100);
            int y =(int) Math.sqrt(i + 268);
            if(x * x == i + 100 && y * y == i+268 ){
                System.out.println(i);
                num += 1;
            }
        }
        System.out.println("这样的数有" + num + "个");
    }
}
//【根据条件求数】一个整数，它加上100或者268后都是一个完全平方数，请问在1万以内，这样的数有几个，分别是多少？
//注：使用Math.sqrt(double a)方法可以求a的平方根。