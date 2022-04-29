public class Homework08 {
    public static void main(String[] args) {
        for(int i = 2; i <=1000;i++){
            int sum = 0;
            for(int j = 1; j < i;j++){
                if(i % j == 0){
                    sum += j;
                }
            }
            if(sum == i){
                System.out.println(sum);
            }
        }
    }
}
//【求完数】一个数如果恰好等于它的所有真因子（即除了自身外的所有因数）之和，
// 这个数就称为"完数"。请编程求出1000以内的所有完数。