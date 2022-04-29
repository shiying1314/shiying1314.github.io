public class Homework30 {
    public static void main(String[] args) {
        double a = 24 + 8 + 3;
        double b = (24 + 8 + 3) * 0.8;
        double c = 16 + 8 + 3;
        double min = (a < b ? a : b) < c ? (a < b ? a : b) : c;
        System.out.println("最少要花" + min + "元");
    }
}
//【三目运算符】某小伙想定一份外卖，商家的优惠方式如下：
//鱼香肉丝单点 24 元，油炸花生米单点 8 元，米饭单点 3 元。
//订单满 30 元 8 折优惠。鱼香肉丝优惠价 16 元，
// 但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？