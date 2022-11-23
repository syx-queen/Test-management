/*快速排序*/

public class function {
    public static  int[] main(){
        int [] numbers = {0, 2, 9, 10, 87};
        System.out.println("before sort:");
        printf_arr(numbers);
        quick(numbers);
        System.out.println("after sort:");
        printf_arr(numbers);
        return numbers;
    }

    //获取中间数，这里在运行大量数据时会爆栈，暂且不考虑这种情况
    public static  int getMiddle(int [] numbers, int low , int high){
        int temp = numbers[low];
        while(low < high){
            while(low < high && numbers[high] >= temp){
                high--;
            }
            numbers[low] = numbers[high];
            while(low < high && numbers[low] < temp){
                low++;
            }
            numbers[high] = numbers[low];
        }
        numbers[low] = temp;
        return low;
    }

    //递归
    public static void quickSort(int[] numbers, int low, int high){
        if(low < high){
            int middle = getMiddle(numbers, low, high);
            quickSort(numbers, low, middle - 1);
            quickSort(numbers, middle + 1, high);
        }
    }

    //打印数组
    public static void printf_arr(int[] numbers){
        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i] + " ");
        }
        System.out.println(" ");
    }

    public static void quick(int[] numbers){
        if(numbers.length > 0){
            quickSort(numbers, 0, numbers.length - 1);
        }
        else if(numbers.length == 0){
            System.exit(0);
        }

    }
}