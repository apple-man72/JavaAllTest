package suanFa.leeCode;

public class 只出现一次的数字 {
    public static void main(String[] args) {
        int nums[] = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    /**
     * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
     * 说明：
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     */
    public static int singleNumber(int[] nums) {



        int ans = nums[0];
        if (nums.length > 1) {
            for (int i = 1; i < nums.length; i++) {
                ans = ans ^ nums[i];
            }
        }
        return ans;

//        int single = 0;
//        for (int num : nums) {
//            single ^= num;
//        }
//        return single;


    }
}
