import java.util.Scanner;

public class Homework35 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的元素个数");
        int num =scanner.nextInt();
        int[] arr04 = new int[num];
        System.out.println("请输入数组的各元素值");
        for(int i = 0; i < num; i++){
            arr04[i] = scanner.nextInt();
        }
        int min = arr04[0];
        int max = arr04[0];
        int maxIndex = 0;
        int minIndex = 0;
        for(int i = 0; i < num; i++) {
            if (arr04[i] > max) {
                max = arr04[i];
                maxIndex = i;
            }
        }
        int temp1 = 0;
        temp1 = arr04[0];
        arr04[0] = arr04[maxIndex];
        arr04[maxIndex] = temp1;
        System.out.println("把它最大的元素与第一个元素交换后的数组为");
        for(int i = 0; i < arr04.length; i++){
            System.out.print(arr04[i] + " ");
        }
        System.out.print("\n");
        for(int i = 0; i < num; i++) {
            if(arr04[i] <= min){
                min = arr04[i];
                minIndex = i;
            }
        }
        int temp2;
        temp2 = arr04[num - 1];
        arr04[num - 1] = arr04[minIndex];
        arr04[minIndex] = temp2;
        System.out.println("把它最小的元素与最后一个元素交换后的数组为");
        for(int i = 0; i < num; i++){
            System.out.print(arr04[i]+" ");
        }
    }
}
//【数组元素的交换】给出一个int数组，把它最大的元素与第一个元素交换，
// 最小的元素与最后一个元素交换，输出交换后的数组。