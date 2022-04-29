import java.util.Scanner;

public class Homework29 {
    public static void main(String[] args) {
        System.out.print("请输入年份");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        System.out.print("请输入月份1-12");
        int month = scanner.nextInt();
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("这个月应该有31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("这个月应该有30天");
                break;
            case 2:
                if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                    System.out.println("这个月应该有29天");
                }else{
                    System.out.println("这个月应该有28天");
                }
                break;
        }
    }
}
//【switch练习】输入年份和月份，输出这个月应该有多少天
//（使用switch结构，需要考虑闰年和平年，注意case穿越）