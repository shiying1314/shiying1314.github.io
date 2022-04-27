public class Homework04 {
    public static void main(String[] args){
        for(int figure = 100; figure <= 999;figure++){
            if(Math.pow((figure / 100), 3) + Math.pow((figure / 10 % 10), 3)
                    +Math.pow((figure % 10), 3) == figure){
                System.out.println(figure);
            }
        }
    }
}
//【水仙花数】请打印出所有的水仙花数。
//注：所谓的"水仙花数"是指一个三位数，其各位数字的立方和等于该数本身。
// 例如153是一个"水仙花数"，因为153 = 1的三次方 + 5的三次方 + 3的三次方。
// （使用for循环遍历一下就出来了）
//double y = Math.pow(x,a) 表示将y的值设置成x的a次幂