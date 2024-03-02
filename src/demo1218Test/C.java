package demo1218Test;

import java.util.UUID;

class C {
    public static int sum(int n) {
        if (n > 2) {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    return 0;
                }
            }
            return 1;
        } else {
            System.out.println("请输入比2大的数！");
        }
       return 9;

    }

    public static void main(String[] args) {

        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
       //62ab42a857c34291b4ebad8d9f8d55ef
        //d38cb910dc124cf9a0632ed9843ae8f7
        //47e00f93f9154f239f2145f82c59aa62
        //f879d61ee46549ac86964e234ac69e1c
    }
    //47e00f93f9154f239f2145f82c59aa62.png,62ab42a857c34291b4ebad8d9f8d55ef.png,a4b9539075f543c790d61e483035b60c.png,d38cb910dc124cf9a0632ed9843ae8f7.png,f879d61ee46549ac86964e234ac69e1c.png

}

