package suanFa;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 7, 4, 5};
        mapoao(nums);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] mapoao(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < num.length; j++) {
                min = num[min] > num[j] ? j : min;
            }
            int temp = num[i];
            num[i] = num[min];
            num[min] = temp;
        }
        return num;
    }
}
