package suanFa;

public class test {
    public static void main(String[] args) {
        double height = 100;
        double nums = 0;  //次数
        double result = 0; // 总米数
        while (height/2 >= 0.01){
            height = height/2;
            nums++;
            result += height;
        }
        System.out.println("总次数="+ nums);
        System.out.println("123323");
        System.out.println("总米数="+ result);

    }
}