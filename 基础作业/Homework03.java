import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入学生成绩[1-100]");
        int grade = myScanner.nextInt();
        if(grade >= 90){
            System.out.println("优秀");
        }else if(grade >= 80 && grade < 90){
            System.out.println("良好");
        }else if(grade >= 70 && grade < 80){
            System.out.println("中等");
        }else if(grade >= 60 && grade < 70){
            System.out.println("及格");
        }else if(grade < 60){
            System.out.println("不及格");
        }else {
            System.out.println("你输入的分数有误[1-100]");
        }
    }
}
//【if多分支】键盘录入一个学生成绩（用int表示），自动输出该同学的成绩评级。
//学生的分数取值范围[0,100]
//分数大于等于90的，评级"优秀"；
//分数大于等于80，小于90的，评级"良好"；
//分数大于等于70，小于80的，评级"中等"；
//分数大于等于60，小于70的，评级"及格"；
//分数小于60的，评级"不及格"；