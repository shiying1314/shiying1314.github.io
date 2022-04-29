public class Homework16 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 1; i <= 50; i++){
            sum1 += (2*i-1);
        }
        System.out.println("100以内的所有奇数的和为" + sum1);
        for(int j = 1; j <= 50; j++){
            sum2 += 2*j;
        }
        System.out.println("100以内的所有偶数的和为" + sum2);
    }
}
//【求奇数和】求100以内的所有奇数/偶数的和。