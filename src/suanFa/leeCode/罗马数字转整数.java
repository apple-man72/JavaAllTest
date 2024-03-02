package suanFa.leeCode;

import java.util.HashMap;
import java.util.Map;

public class 罗马数字转整数 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>() {{
            put('I', 1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }};
        int length = s.length();
        int num = 0;
        for (int i = 0; i < length; i++) {
            int value = map.get(s.charAt(i));
            if (i < length - 1 && value < map.get(s.charAt(i + 1))) {
                num -= value;
            } else {
                num += value;
            }

        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }
}
