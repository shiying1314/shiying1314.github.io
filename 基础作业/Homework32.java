public class Homework32 {
    public static void main(String[] args) {
        Methods02 methods01 = new Methods02();
        int num = methods01.get02(5);
        System.out.println("第五个人的岁数为" + num);
    }
}
class Methods02 {
    public int get02(int i) {
        if (i == 1) {
            return 10;
        } else {
            return get02(i-1) + 2;
        }
    }
}
//【递归】有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。
// 问第4个人岁数，他说比第3个人大2岁。问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。
//最后问第一个人，他说是10岁。请问第五个人多大？