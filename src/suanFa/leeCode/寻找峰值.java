package suanFa.leeCode;

import java.util.HashMap;
import java.util.Map;

public class 寻找峰值 {
    public static void main(String[] args) {
        int[] a = {2, 51, 12, 95, 42, 52, 76, 77, 23, 81, 71, 41, 2, 23, 43, 4, 64, 22, 71, 96, 1, 87, 51, 91, 67, 16, 58, 11, 44, 38, 63, 14, 4, 69, 88, 49, 92, 91, 9, 15, 17, 74, 21, 91, 24, 78, 62, 50, 82, 26, 53, 18, 25, 14, 94, 79, 44, 11, 36, 38, 44, 53, 9, 34, 58, 6, 50, 82, 81, 50, 36, 1, 6, 61, 9, 47, 33, 47, 84, 41, 57, 48, 73, 18};
        System.out.println("a的长度" + a.length);
        System.out.println("aa:" + solve(a));
    }

    public static int solve(int[] a) {
        //[2,4,1,2,7,8,4]
        int x = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i - 1] <= a[i] && a[i] >= a[i + 1]) {
                map.put(a[i], i);
            }
        }
        System.out.println(map);
        int max = 0;
        for (int y : map.keySet()) {
            if (y > max) {
                max = y;
            }
        }

        return map.get(max);

    }
}
