package suanFa.leeCode;

public class 移除元素 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4, 5};
        System.out.println(removeElement(nums, 2));
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] != val) {
                nums[left] = nums[right];
                left++;
            }
        }
         return left;
    }
}
