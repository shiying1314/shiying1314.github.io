public class Homework11 {
    public static void main(String[] args) {
        double zi = 2.0;
        double mu = 1.0;
        double sum = 0;
        for(int num1 = 1; num1 <= 20; num1++){
            sum += zi / mu;
            zi = mu + zi;
            mu = zi - mu;
        }
        System.out.println(sum);
    }
}
//【数列的前n项和】有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13.....求出这个数列的前20项之和。
//注：提前告诉你答案是32.66026079864164