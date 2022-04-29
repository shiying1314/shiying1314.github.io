public class Homework23 {
    public static void main(String[] args) {
        int count = 0;
        for(int i = 0; i <= 10000; i++){
            if(i < 10 && i % 10 == i * i %10){
                System.out.println(i);
                count++;
            }else if(i >= 10 && i < 100 &&
                    i % 10 == i * i %10 && i / 10 % 10 == i * i / 10 % 10){
                System.out.println(i);
                count++;
            }else if(i >= 100 && i < 1000 && i % 10 == i * i %10 &&
                    i / 10 % 10 == i * i / 10 % 10 && i / 100 % 10 == i * i / 100 %10){
                System.out.println(i);
                count++;
            }else if(i >= 1000 && i < 10000 && i % 10 == i * i %10 &&
                    i / 10 % 10 == i * i / 10 % 10 && i / 100 % 10 == i * i / 100 %10 &&
                    i / 1000 % 10 == i * i / 1000 %10){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("10000以内的自守数的个数为" + count );
    }
}
//【求自守数】自守数是指一个数的平方的尾数等于该数自身的自然数。
// 例如：25^2 = 625，76^2 = 5776，9376^2 = 87909376。请求出10000（一万）以内的自守数的个数，并分别输出。