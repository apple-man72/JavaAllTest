package suanFa.leeCode;

public class 最长公共前缀 {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.length; i++) {
            char s = strs[0].charAt(0);
            if (s == strs[i].charAt(i)) {
                sb.append(s);
            }
        }
        return String.valueOf(sb);
    }


}
