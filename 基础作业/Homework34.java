public class Homework34 {
    public static void main(String[] args) {
        double[] arr02 = {1, 2, 3, 4, 5, 6, 7, 8};
        double num = Math.random() * 7 + 1;//随机生成一个1-8的数
        double[] arr03 = new double[arr02.length + 1];
        arr03[0] = num;
        for(int i = 0; i < arr03.length - 1; i++){
            arr03[i + 1] = arr02[i];
        }
        System.out.println("插入数组的值为" + num);
        for(int i = 0; i < arr03.length; i++){
            if(arr03[i] > arr03[i + 1]){
                double temp = arr03[i];
                arr03[i] = arr03[i + 1];
                arr03[i + 1] = temp;
            }else{
                break;
            }
        }
        for(int i = 0; i < arr03.length; i++){
            System.out.print(arr03[i] + " ");//输出排序后的数组
        }
    }
}
//【数组元素的插入】有一个已经排好序的int数组{1, 2, 3,4, 5, 6, 7, 8}。
// 现输入一个数（要求该数在1-8之间），按原来的规律将它插入数组中。