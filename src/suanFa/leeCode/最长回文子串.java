package suanFa.leeCode;

public class 最长回文子串 {
    /**
     * 描述
     * 对于一个字符串，请设计一个高效算法，计算其中最长回文子串的长度。
     * <p>
     * 给定字符串A以及它的长度n，请返回最长回文子串的长度。
     * 输入："abc1234321ab",12
     * 返回值：7
     */
    public int getLongestPalindrome(String A, int n) {
        // write code here
        char[] ch = A.toCharArray();
        int res = 0;
        for (int i = 0; i < n; i++) {
            int l = i, r = i, sameR = i;
            //定位左右两边,避免abba和aba
            while (l - 1 >= 0 && ch[l - 1] == ch[i]) l--;
            while (r + 1 < n && ch[r + 1] == ch[i]) r++;
            sameR = r;

            while (l - 1 >= 0 && r + 1 < n && ch[l - 1] == ch[r + 1]) {
                l--;
                r++;
            }


            res = Math.max(res, r - l + 1);

            //优化
            i = sameR;
        }
        return res;

    }
}
