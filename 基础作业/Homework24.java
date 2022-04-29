public class Homework24 {
    public static void main(String[] args) {
        int money =20;
        int price = 3;
        int bottle = 0;
        int change = 0;
        int sum = 0;
        while(money >= price){
            bottle = money / price;
            change = money - price * bottle;
            money = change +bottle;
            sum += bottle;
        }
        System.out.println("最多可以喝到" + sum + "瓶饮料");
    }
}
//【循环练习】给20块钱买饮料，每瓶饮料3块钱，喝完之后退瓶子可以换回1块钱。问最多可以喝到多少瓶饮料？