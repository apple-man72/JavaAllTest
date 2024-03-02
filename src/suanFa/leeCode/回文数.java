package suanFa.leeCode;


public class 回文数 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reverseNum = 0;
        while (x > reverseNum) {
            reverseNum = reverseNum * 10 + x % 10; //r=1  r=12
            x /= 10; //x=12  x=1
        }
        return x == reverseNum || x == reverseNum / 10;

    }

    public static void main(String[] args) {
        System.out.println(0/10);
    }
}