package suanFa.leeCode;


//用%20替换空格
class 替换空格 {
    public static String replaceSpace(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Character a : s.toCharArray()) {
            if (a == ' ') {
                stringBuilder.append("%20");
            } else {
                stringBuilder.append(a);
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace("wjijfihqhr723  h h 78ghr   b byf q"));
    }

}