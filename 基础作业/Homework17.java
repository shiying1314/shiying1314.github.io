public class Homework17 {
    public static void main(String[] args) {
        double h = 100;
        double sum = 100;
        for(int i = 1; i < 10; i++){
            sum = sum + h;
            h = h / 2;
        }
        System.out.println("共经过" + sum + "米");
        System.out.println("第10次反弹" + (h / 2) + "米");
    }
}
//【自由落体】假如一个小球从100米高度自由落下，每次落地后就反跳回原高度的一半。
// 那么求它在第10次落地时，共经过多少米？第10次反弹多高？