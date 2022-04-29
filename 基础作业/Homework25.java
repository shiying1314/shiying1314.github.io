public class Homework25 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; sum < 56.7; i++){
            sum += 5;
            if(sum > 56.7){
                System.out.println("蜗牛需要" + i +"天才能从井底到爬出来");
                break;
            }
            sum -= 3.5;
        }
    }
}
//【循环练习】井里有一只蜗牛，他白天往上爬5米，晚上掉3.5米，井深56.7米，计算蜗牛需要多少天才能从井底到爬出来。