package suanFa.leeCode;

import java.util.*;

public class 是否所有1都至少相隔k个元素 {
    public static void main(String[] args) {
        int nums[] = {0, 0, 0, 0};
        int k = 2;
        System.out.println(kLengthApart(nums, k));

    }

    public static boolean kLengthApart(int[] nums, int k) {
        int n = nums.length;
        int prev = -1;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == 1) {
                if (prev != -1 && i - prev - 1 < k) {
                    return false;
                }
                prev = i;
            }
        }
        return true;

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] == 1) {
//                list.add(i);
//            }
//        }
//        System.out.println("list=" + list);
//        List<Integer> list1 = new ArrayList<>();
//        if (list.size() == 1) {
//            return false;
//        }
//        for (int i = 1; i < list.size(); i++) {
//            list1.add(list.get(i) - list.get(i - 1) - 1);
//        }
//        System.out.println("list1=" + list1);
//        int min = list1.stream().filter(e -> e != null).min(Comparator.naturalOrder()).orElse(null);
//        System.out.println(min);
//        if (min == k) {
//            return true;
//        } else {
//            return false;
//        }
    }


}
