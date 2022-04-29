public class Homework33 {
    public static void main(String[] args) {
        int[] arr01 = new int[10];
        System.out.println("随机生成10个数");
        for(int i = 0; i < arr01.length; i++){
            arr01[i] = (int)(Math.random()*100);
            System.out.print(arr01[i]+" ");//遍历并输出这10个数
        }
        System.out.println();//换行
        for(int i = 1; i < arr01.length; i++){
            for(int j = 0 ; j < arr01.length - i; j++){
                if(arr01[j] > arr01[j +1]){
                    int temp = arr01[j];
                    arr01[j] = arr01[j + 1];
                    arr01[j + 1] = temp;
                }
            }
        }
        System.out.println("排序后的数组为");
        for(int i = 0; i < arr01.length; i++){
            System.out.print(arr01[i] + " ");
        }
    }
}
//【排序】随机给十个数字，对它们进行排序。
// （可以给一个有10个整数元素的数组，然后对数组排序）