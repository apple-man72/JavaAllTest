package suanFa.leeCode;

public class 验证回文串 {

    public static void main(String[] args) {
        System.out.println(isPalindrome2("A man, a plan, a canal: Panama"));
    }

    /**
     * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     * <p>
     * 说明：本题中，我们将空字符串定义为有效的回文串。
     */
    public static boolean isPalindrome1(String s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i <= s.length() - 1; i++) {
            Character ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                sb.append(Character.toLowerCase(ch));
            }
        }
        StringBuffer bs = new StringBuffer(sb).reverse();
        return sb.toString().equals(bs.toString());


    }

    public static boolean isPalindrome2(String s) {
        int n = s.length();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }

        return true;
    }

}
