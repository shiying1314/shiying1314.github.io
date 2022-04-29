public class Homework09 {
    public static void main(String[] args) {
        int num1 =0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++){
                    if(i != j && i != k && j != k){
                        System.out.println(i*100+j*10+k);
                        num1++;
                    }
                }
            }
        }
        System.out.println("能组成" + num1 + "个不相等且无重复数字的三位数");
    }
}
//【求不重复数字】有1、2、3、4一共四个数字，能组成多少个不相等且无重复数字的三位数？都是多少？
//注：可填在百位、十位、个位的数字都是1、2、3、4。组成所有的排列后再去掉不满足条件的就可以了。